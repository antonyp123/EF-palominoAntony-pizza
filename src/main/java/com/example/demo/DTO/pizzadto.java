package com.example.demo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class pizzadto {
	
	private Integer idpizza;
	private String nombrepizza;
	private String descripcion;
	public Integer getIdpizza() {
		return idpizza;
	}
	public void setIdpizza(Integer idpizza) {
		this.idpizza = idpizza;
	}
	public String getNombrepizza() {
		return nombrepizza;
	}
	public void setNombrepizza(String nombrepizza) {
		this.nombrepizza = nombrepizza;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	


}
