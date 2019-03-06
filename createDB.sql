DROP TABLE IF EXISTS Reservation;
DROP TABLE IF EXISTS Client;
DROP TABLE IF EXISTS Chambre;


CREATE TABLE Chambre(
idChambre  INT AUTO_INCREMENT ,
typeChambre VARCHAR(20) NOT NULL ,
nbPlaceLit  INT NOT NULL ,
prixJournalier  FLOAT NOT NULL,
primary key (idChambre)
);

CREATE TABLE Client(
idClient  INT AUTO_INCREMENT, 
nom  VARCHAR(20) NOT NULL ,
prenom  VARCHAR(20) NOT NULL ,
addresse  VARCHAR(40) ,
email  VARCHAR(30) ,
numTelephone  VARCHAR(10),
primary key(idClient)
);

CREATE TABLE Reservation(
idReservation  INT AUTO_INCREMENT ,
idChambre  INT NOT NULL ,
idClient INT NOT NULL ,
dateDeb  DATE NOT NULL ,
dateFin  DATE NOT NULL ,
nbPlaces  INT NOT NULL ,
paiementEffectue  BOOLEAN NOT NULL,
primary key(idReservation),
foreign key(idChambre) references Chambre(idChambre),
foreign key(idClient) references Client(idClient)
);
