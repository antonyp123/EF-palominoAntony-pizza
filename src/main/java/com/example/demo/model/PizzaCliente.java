package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizza_cliente")
public class PizzaCliente {
	
	@Id
	private PizzaClienteFK fk =new PizzaClienteFK();

	public PizzaClienteFK getFk() {
		return fk;
	}

	public void setFk(PizzaClienteFK fk) {
		this.fk = fk;
	}

}
