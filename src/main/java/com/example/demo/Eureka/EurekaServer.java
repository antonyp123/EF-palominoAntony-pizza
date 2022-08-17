package com.example.demo.Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EurekaServer {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}

}
