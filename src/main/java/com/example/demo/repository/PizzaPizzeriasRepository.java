package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.PizzaPizzeria;

public interface PizzaPizzeriasRepository extends JpaRepository<PizzaPizzeria, Integer> {

}
