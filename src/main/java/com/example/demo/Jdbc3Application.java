package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jdbc3Application {
	private final DBController dbController;
	public Jdbc3Application(DBController dbController) {
		this.dbController = dbController;
	}

	public static void main(String[] args) {
		SpringApplication.run(Jdbc3Application.class, args);
	}
}
