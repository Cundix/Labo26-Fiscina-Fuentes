use NEW_TP_BASES_DE_DATOS_FINALL;

UPDATE Voto v
SET PartidoID = (
			SELECT VOTE_COUNT.PartidoID
			FROM (
					SELECT v2.PartidoID, count(v2.PartidoID) as CANTVOTOS
					FROM Voto v2	
					GROUP BY v2.PartidoID
					ORDER BY CANTVOTOS DESC
					LIMIT 1
				) as VOTE_COUNT)
WHERE v.id in (
				SELECT VOTES.PartidoID
				FROM (
					SELECT v2.PartidoID
					FROM Voto v2	
					GROUP BY v2.PartidoID
					ORDER BY COUNT(*) ASC
					LIMIT 1
				) as VOTES);



INSERT INTO Partido (Nombre, Ideologia)
VALUES (CONCAT('Partido de',
    (SELECT c.Nombre
     FROM Voto v
     JOIN Candidato c ON c.ID = v.CandidatoID
     GROUP BY v.CandidatoID
     ORDER BY COUNT(v.ID) DESC
     LIMIT 1)),
    'Sin ideología'
);



UPDATE Candidato c
JOIN (
    SELECT c1.ID, c1.Nombre, c1.Cargo, c1.PartidoID
    FROM Voto v
    JOIN Candidato c1 ON c1.ID = v.CandidatoID
    GROUP BY v.CandidatoID
    ORDER BY COUNT(v.ID) DESC
    LIMIT 1
) AS ganador
ON c.ID = ganador.ID
SET 
    c.Nombre = ganador.Nombre,
    c.Cargo = ganador.Cargo,
    c.PartidoID = ganador.PartidoID;
