package com.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutheticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutheticationServiceApplication.class, args);
		System.out.println("Authentication Server Started!!");
	}

}
