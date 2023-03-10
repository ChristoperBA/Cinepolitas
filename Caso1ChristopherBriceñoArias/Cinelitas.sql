-- ===================================================================================
-- I Caso parcial
-- Christopher Briceño Arias
-- Creacion y Uso de la base de datos
CREATE DATABASE Cinelitas;
 USE Cinelitas;
-- ===================================================================================
CREATE TABLE `peliculas`(
ID_Pelicula INT(12) NOT NULL AUTO_INCREMENT,
ID_Sala VARCHAR(30) NOT NULL,
Nombre_Pelicula VARCHAR(30) NOT NULL,
Costo_Entrada INT(30) NOT NULL,
Fecha_Entrada VARCHAR(30) NOT NULL,
PRIMARY KEY (`ID_Pelicula`,`ID_Sala`),
KEY `fk_peliculas_salas` (`ID_Sala`),
CONSTRAINT `fk_salas` FOREIGN KEY (`ID_Sala`) REFERENCES `salas` (`ID_Sala`) ON DELETE NO ACTION ON UPDATE NO ACTION
)ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

CREATE TABLE `salas`(
ID_Sala VARCHAR(30) NOT NULL,
Numero_Sala VARCHAR(30) NOT NULL,
Capacidad_Maxima INT(12) NOT NULL,
Nombre_Sala VARCHAR(30) NOT NULL,
PRIMARY KEY (`ID_Sala`)
)ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
-- ===================================================================================
-- INSERT TABLE salas
INSERT INTO `salas` VALUES (1,1,40,'Sala 2D');
INSERT INTO `salas` VALUES (2,2,70,'Sala 3D');
INSERT INTO `salas` VALUES (3,3,80,'D-MAX VIP');
INSERT INTO `salas` VALUES (4,4,90,'Sala 4D');


-- Eventos
INSERT INTO `peliculas` VALUES (1,1,'Demon Slayer',3500,'2023-03-14');
INSERT INTO `peliculas` VALUES (2,2,'John Wick',4500,'2023-03-09');
INSERT INTO `peliculas` VALUES (3,3,'Super Mario Bros',3500,'2023-03-25');
INSERT INTO `peliculas` VALUES (4,4,'Scream 6',5500,'2023-03-09');
INSERT INTO `peliculas` VALUES (5,4,'Cred III',6500,'2023-03-12');
-- ===================================================================================
-- Vista de las tablas
select * from `salas`;
select * from `peliculas`;
