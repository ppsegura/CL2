package com.cibertec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "buses")
@Data
public class Bus {
	
	@Id
	@Column(name = "codbus")
	private int id_bus;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "placa")
	private String placa;
	
	@ManyToOne
	@JoinColumn(name="codchofer", insertable =false, updatable = false)
	private Chofer chofer;
	private int id_chofer;
	
	
	@ManyToOne
	@JoinColumn(name="codruta", insertable =false, updatable = false)
	private Ruta ruta;
	private int id_ruta;
}
