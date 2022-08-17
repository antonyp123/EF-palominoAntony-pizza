package com.example.demo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizzeria {
	
	private Integer idpizzeria;
	private String direccion;
	private String sede;
	public Integer getIdpizzeria() {
		return idpizzeria;
	}
	public void setIdpizzeria(Integer idpizzeria) {
		this.idpizzeria = idpizzeria;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}

	
	
	
}
