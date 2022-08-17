package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class PizzaClienteFK implements Serializable {

	private static final long serialVersionUID = 2663990253213850422L;
	/**
	 * 
	 */
	
	
	@Column(name="idpizza", nullable = false, unique = true)
	private Integer pizza;
	
	@Column(name="id_cliente", nullable = false, unique = true)
	private Integer cliente;
	
	public Integer getPizza() {
		return pizza;
	}
	public void setPizza(Integer pizza) {
		this.pizza = pizza;
	}
	public Integer getCliente() {
		return cliente;
	}
	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}
	
	

}
