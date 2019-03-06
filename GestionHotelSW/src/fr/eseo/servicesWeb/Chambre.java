package fr.eseo.servicesWeb;

public class Chambre {
	

	int idChambre, nbPlaceLit; 
	String typeChambre;
	float prixJournalier;
	
	public Chambre() {
		
	}
	
	
	public int getIdChambre() {
		return idChambre;
	}
	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}
	public int getNbPlaceLit() {
		return nbPlaceLit;
	}
	public void setNbPlaceLit(int nbPlaceLit) {
		this.nbPlaceLit = nbPlaceLit;
	}
	public String getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}
	public float getPrixJournalier() {
		return prixJournalier;
	}
	public void setPrixJournalier(float prixJournalier) {
		this.prixJournalier = prixJournalier;
	}
	
	
	
}
