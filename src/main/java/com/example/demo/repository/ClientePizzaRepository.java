package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PizzaCliente;

public interface ClientePizzaRepository extends JpaRepository<PizzaCliente, Integer>{

}
