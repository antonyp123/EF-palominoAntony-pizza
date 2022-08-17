package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Pizza;

@FeignClient(name="idat-cliente", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/cliente/v1/listar")
	public List<Pizza> listarclientes();

}
