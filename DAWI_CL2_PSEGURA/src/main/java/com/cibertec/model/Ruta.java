package com.cibertec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "rutas")
@Data
public class Ruta {
	
	@Id
	@Column(name = "codruta")
	private int id_ruta;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "estado")
	private String estado;
}
