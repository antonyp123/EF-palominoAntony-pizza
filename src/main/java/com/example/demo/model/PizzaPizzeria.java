package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizza_pizzeria")
public class PizzaPizzeria {
	
	@Id
	private PizzapizzeriaFK fk =new PizzapizzeriaFK();

	public PizzapizzeriaFK getFk() {
		return fk;
	}

	public void setFk(PizzapizzeriaFK fk) {
		this.fk = fk;
	}

}
