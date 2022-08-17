package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Pizza;



public interface PizzaService {
	void guardarPizzaz(Pizza pizzaz);
	void actulizarPizza(Pizza pizzaz);
	void eliminarPizza(Integer id);
	List<Pizza> listarpizza();
	Pizza obtenerpizzaId(Integer id);

	void asignarclientePizzas();
}
