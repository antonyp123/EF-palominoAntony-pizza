package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.Cliente;
import com.example.demo.model.Pizza;
import com.example.demo.model.PizzaCliente;
import com.example.demo.model.PizzaClienteFK;
import com.example.demo.model.PizzaPizzeria;
import com.example.demo.model.PizzapizzeriaFK;
import com.example.demo.repository.ClientePizzaRepository;
import com.example.demo.repository.PizzaPizzeriasRepository;
import com.example.demo.repository.PizzaRepository;
import com.example.demo.client.OpenFeignClient;
import feign.Feign;
@Service
public class PizzaServicelmpl implements PizzaService{

	
	@Autowired
	private OpenFeignClient Feing;
	
	@Autowired
	private PizzaRepository repository;
	
	@Autowired
	private  ClientePizzaRepository repositorycliente;
	
	@Autowired
	private PizzaPizzeriasRepository repositorypizzeria;
	
	@Override
	public void guardarPizzaz(Pizza pizzaz) {
		repository.save(pizzaz);
		
	}

	@Override
	public void actulizarPizza(Pizza pizzaz) {
		repository.saveAndFlush(pizzaz);
		
	}

	@Override
	public void eliminarPizza(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Pizza> listarpizza() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Pizza obtenerpizzaId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void asignarclientePizzas() {
		List<Pizza> listado = Feing.listarclientes();;
		PizzaClienteFK fk = null;
		PizzapizzeriaFK fk2 = null;
		PizzaCliente detalle = null;
		PizzaPizzeria detalle2 = null;

		
		for (Pizza pizza : listado) {
			

			fk2 = new PizzapizzeriaFK();
	
			
			
			detalle = new PizzaCliente();
			detalle.setFk(fk);	
			
			detalle2 = new PizzaPizzeria();
			detalle2.setFk(fk2);	
			
			repositorycliente.save(detalle);
			repositorypizzeria.save(detalle2);
		}
	}

}
