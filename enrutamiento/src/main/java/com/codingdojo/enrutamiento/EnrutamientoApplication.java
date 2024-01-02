package com.codingdojo.enrutamiento;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnrutamientoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrutamientoApplication.class, args);
	}
	
}
