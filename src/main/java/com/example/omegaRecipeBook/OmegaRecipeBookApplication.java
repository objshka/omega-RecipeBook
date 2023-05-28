package com.example.omegaRecipeBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OmegaRecipeBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmegaRecipeBookApplication.class, args);
	}
	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello World!";
	}

}
