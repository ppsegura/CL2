package com.cibertec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "choferes")
@Data
public class Chofer {
	
	@Id
	@Column(name = "codchofer")
	private int id_chofer;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "telefono")
	private int telefono;
	
	@Column(name = "correo")
	private String correo;
}
