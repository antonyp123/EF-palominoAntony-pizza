package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class EfAntonypalominoPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfAntonypalominoPizzaApplication.class, args);
	}

}
