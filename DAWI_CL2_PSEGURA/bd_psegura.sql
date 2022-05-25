-- borra la bd si existe
DROP DATABASE IF EXISTS bd_psegura;

SET GLOBAL FOREIGN_KEY_CHECKS=0;

-- creamos la bd
CREATE DATABASE bd_psegura;
-- activamos la bd
USE bd_psegura;

-- Tabla choferes
create table choferes(
codchofer int not null primary key,
nombres varchar(70),
apellidos varchar(70),
telefono int,
correo varchar(120)
);

-- Tabla rutas
create table rutas(
codruta int not null unique primary key,
nombre varchar(100),
estado varchar(40)
);

-- Tabla Buses
create table buses(
codbus int not null unique primary key,
codchofer int not null,
codruta int not null,
marca varchar(70),
modelo varchar(70),
placa varchar(20),
foreign key(codruta) references rutas(codruta),
foreign key(codchofer) references choferes(codchofer)
);

