package com.scalab.clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

	@Id
//	@Column(name = "id_rol", nullable = false)
	private Integer idRol;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;

	public Rol() {}

	public Rol(Integer idRol, String nombre) {
		this.idRol = idRol;
		this.nombre = nombre;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
