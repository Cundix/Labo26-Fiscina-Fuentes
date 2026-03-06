use database NEW_TP_BASES_DE_DATOS_FINALL;

CREATE TABLE Usuario (
    DNI VARCHAR(20) PRIMARY KEY,
    Nombre VARCHAR(100),
    Apellido VARCHAR(100),
    FechaNacimiento DATE
);

INSERT INTO Usuario (DNI, Nombre, Apellido, FechaNacimiento) VALUES
('12345678A', 'Juan', 'Pérez', '1980-01-01'),
('23456789B', 'María', 'Gómez', '1990-02-02'),
('34567890C', 'Carlos', 'López', '1985-03-03'),
('45678901D', 'Ana', 'Martínez', '1992-04-04'),
('56789012E', 'Luis', 'Hernández', '1988-05-05'),
('67890123F', 'Laura', 'Díaz', '1995-06-06'),
('78901234G', 'José', 'Fernández', '1983-07-07'),
('89012345H', 'Marta', 'Sánchez', '1991-08-08'),
('90123456I', 'Pedro', 'García', '1987-09-09'),
('01234567J', 'Lucía', 'Rodríguez', '1993-10-10');

CREATE TABLE Votante (
    NumeroVotante INT PRIMARY KEY AUTO_INCREMENT,
    DNI VARCHAR(20),
    Habilitado BOOLEAN,
    FOREIGN KEY (DNI) REFERENCES Usuario(DNI)
);

INSERT INTO Votante (DNI, Habilitado) VALUES
('12345678A', TRUE),
('23456789B', TRUE),
('34567890C', FALSE),
('45678901D', TRUE),
('56789012E', TRUE),
('67890123F', FALSE),
('78901234G', TRUE),
('89012345H', TRUE),
('90123456I', FALSE),
('01234567J', TRUE);

CREATE TABLE Establecimiento (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Provincia VARCHAR(100),
    Nombre VARCHAR(100),
    Direccion VARCHAR(255)
);

INSERT INTO Establecimiento (Provincia, Nombre, Direccion) VALUES
('Provincia1', 'Establecimiento1', 'Dirección 1'),
('Provincia2', 'Establecimiento2', 'Dirección 2'),
('Provincia3', 'Establecimiento3', 'Dirección 3'),
('Provincia4', 'Establecimiento4', 'Dirección 4'),
('Provincia5', 'Establecimiento5', 'Dirección 5'),
('Provincia6', 'Establecimiento6', 'Dirección 6'),
('Provincia7', 'Establecimiento7', 'Dirección 7'),
('Provincia8', 'Establecimiento8', 'Dirección 8'),
('Provincia9', 'Establecimiento9', 'Dirección 9'),
('Provincia10', 'Establecimiento10', 'Dirección 10');

CREATE TABLE Partido (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(100),
    Ideologia VARCHAR(100)
);

INSERT INTO Partido (Nombre, Ideologia) VALUES
('Partido1', 'Ideología1'),
('Partido2', 'Ideología2'),
('Partido3', 'Ideología3'),
('Partido4', 'Ideología4'),
('Partido5', 'Ideología5'),
('Partido6', 'Ideología6'),
('Partido7', 'Ideología7'),
('Partido8', 'Ideología8'),
('Partido9', 'Ideología9'),
('Partido10', 'Ideología10');

CREATE TABLE Candidato (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(100),
    Cargo VARCHAR(100),
    PartidoID INT,
    FOREIGN KEY (PartidoID) REFERENCES Partido(ID)
);

INSERT INTO Candidato (Nombre, Cargo, PartidoID) VALUES
('Candidato1', 'Cargo1', 1),
('Candidato2', 'Cargo2', 2),
('Candidato3', 'Cargo3', 3),
('Candidato4', 'Cargo4', 4),
('Candidato5', 'Cargo5', 5),
('Candidato6', 'Cargo6', 6),
('Candidato7', 'Cargo7', 7),
('Candidato8', 'Cargo8', 8),
('Candidato9', 'Cargo9', 9),
('Candidato10', 'Cargo10', 10);

CREATE TABLE Eleccion (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Modalidad VARCHAR(50),
    Tipo VARCHAR(50)
);

INSERT INTO Eleccion (Modalidad, Tipo) VALUES
('Virtual', 'Tipo1'),
('Presencial', 'Tipo2'),
('Virtual', 'Tipo3'),
('Presencial', 'Tipo4'),
('Virtual', 'Tipo5'),
('Presencial', 'Tipo6'),
('Virtual', 'Tipo7'),
('Presencial', 'Tipo8'),
('Virtual', 'Tipo9'),
('Presencial', 'Tipo10');

CREATE TABLE Voto (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    VotanteID INT,
    EleccionID INT,
    EstablecimientoID INT,
    PartidoID INT,
    CandidatoID INT,
    FOREIGN KEY (VotanteID) REFERENCES Votante(NumeroVotante),
    FOREIGN KEY (EleccionID) REFERENCES Eleccion(ID),
    FOREIGN KEY (EstablecimientoID) REFERENCES Establecimiento(ID),
    FOREIGN KEY (PartidoID) REFERENCES Partido(ID),
    FOREIGN KEY (CandidatoID) REFERENCES Candidato(ID)
);

INSERT INTO Voto (VotanteID, EleccionID, EstablecimientoID, PartidoID, CandidatoID) VALUES
(1, 1, 1, 1, 1),
(2, 2, 2, 2, 2),
(3, 3, 3, 3, 3),
(4, 4, 4, 4, 4),
(5, 5, 5, 5, 5),
(6, 6, 6, 6, 6),
(7, 7, 7, 7, 7),
(8, 8, 8, 8, 8),
(9, 9, 9, 9, 9),
(10, 10, 10, 10, 10);