package fr.eseo.servicesWeb;

import java.sql.Date;

public class Reservation {

int idReservation, idChambre, idClient,nbPlaces;
Date dateDeb, dateFin;
boolean paiementEffectue;
public Reservation(int idReservation, int idChambre, int idClient, int nbPlaces, Date dateDeb, Date dateFin,
		boolean paiementEffectue) {
	super();
	this.idReservation = idReservation;
	this.idChambre = idChambre;
	this.idClient = idClient;
	this.nbPlaces = nbPlaces;
	this.dateDeb = dateDeb;
	this.dateFin = dateFin;
	this.paiementEffectue = paiementEffectue;
}
public int getIdReservation() {
	return idReservation;
}
public void setIdReservation(int idReservation) {
	this.idReservation = idReservation;
}
public int getIdChambre() {
	return idChambre;
}
public void setIdChambre(int idChambre) {
	this.idChambre = idChambre;
}
public int getIdClient() {
	return idClient;
}
public void setIdClient(int idClient) {
	this.idClient = idClient;
}
public int getNbPlaces() {
	return nbPlaces;
}
public void setNbPlaces(int nbPlaces) {
	this.nbPlaces = nbPlaces;
}
public Date getDateDeb() {
	return dateDeb;
}
public void setDateDeb(Date dateDeb) {
	this.dateDeb = dateDeb;
}
public Date getDateFin() {
	return dateFin;
}
public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}
public boolean isPaiementEffectue() {
	return paiementEffectue;
}
public void setPaiementEffectue(boolean paiementEffectue) {
	this.paiementEffectue = paiementEffectue;
}


}
