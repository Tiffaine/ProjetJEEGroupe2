

--trouver une chambre à partir d'une chambre demandée par le client

sql_query = 'SELECT * FROM Chambre c WHERE c.typeChambre LIKE "%'+typeChambre_param+'%"';
if(nbPlaceLit_param != 0){
	sql_query+ = ' and c.nbPlaceLit = '+ String.valueOf(nbPlace_param);
}
if(prixMin_param != 0){
	sql_query+= ' and c.prixJournalier >= '+ String.valueOf(prixMin_param);
}
if(prixMax_param != 0){
	sql_query+= ' and c.prixJournalier <= '+ String.valueOf(prixMax_param);
}

-- Réserver une chambre

'INSERT INTO Reservation(idChambre, idClient, dateDeb, dateFin, nbPlaces, paiementEffectue) VALUES
