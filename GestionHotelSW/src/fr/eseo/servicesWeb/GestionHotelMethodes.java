package fr.eseo.servicesWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionHotelMethodes {

	/*public Chambre[] trouverChambre(Chambre chambre) {
		
		Chambre[] chambre_array ;
		//Requete bdd
		
		for(int i=0; i<20; i++) {
			
		}
		 return chambre_array;
	}*/
	
	public int reserverChambre(Reservation reservation) {
		int code_reservation;
		
		code_reservation = 3*4;
		
		return code_reservation;
	}
			
	public boolean payerChambre(int code_reservation) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/GestionHotel?user=root&password=");
		
		Statement stmt = conn.createStatement();
		String insert = "";
		boolean executebool = stmt.execute(insert);
		
		if(!executebool) {
		System.out.print("Exécution réussie");
		}else {
			System.out.print("Problème d'exécution");
		}
		stmt.close();
		conn.close();
		return executebool;
	}
			
	public boolean annulerChambre(int code_reservation) {
		return true;
	}
}
