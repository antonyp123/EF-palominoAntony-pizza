package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class PizzapizzeriaFK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 166496437020675039L;
	
	
	@Column(name="idpizza", nullable = false, unique = true)
	private Integer pizza;
	
	@Column(name="idpizzeria", nullable = false, unique = true)
	private Integer pizzerias;
	
	public Integer getPizza() {
		return pizza;
	}
	public void setPizza(Integer pizza) {
		this.pizza = pizza;
	}
	public Integer getPizzerias() {
		return pizzerias;
	}
	public void setPizzerias(Integer pizzerias) {
		this.pizzerias = pizzerias;
	}
	
	

}
