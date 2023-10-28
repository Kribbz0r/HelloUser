package com.helloUser.helloUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloUserApplication {

	public static SecretClub secretClub = new SecretClub("Barnarps Förenade Fågelskådare");

	public static void main(String[] args) {
		SpringApplication.run(HelloUserApplication.class, args);
		// Lägg till default members

	}
}
