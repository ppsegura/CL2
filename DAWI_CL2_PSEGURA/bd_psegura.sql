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
marca varchar(70),
modelo varchar(70),
placa varchar(20),
codchofer int not null,
codruta int not null,
foreign key(codruta) references rutas(codruta),
foreign key(codchofer) references choferes(codchofer)
);

-- inserts
insert into choferes values (1, 'Juan', 'Flores',940135789, 'juanflores@gmail.com');
insert into choferes values (2, 'Carlos','Ramirez',940456321, 'carlos@gmail.com');
insert into choferes values (3, 'Enrique','Alvarado',987321966, 'enriquea@gmail.com');

insert into rutas values (1, 'Lima Norte','Habilitado');
insert into rutas values (2, 'Lima Este','Deshabilitado');
insert into rutas values (3, 'Lima Sur','Habilitado');

insert into buses values (1, 'Nissan', 'RT2', 'Q65-T045', 1,1);
insert into buses values (2, 'Volkswagen', 'KX4', 'Q65-T046', 2,2);
insert into buses values (3, 'Mitsubishi', 'TR3', 'Q65-T047', 3,3);

SELECT * FROM buses;