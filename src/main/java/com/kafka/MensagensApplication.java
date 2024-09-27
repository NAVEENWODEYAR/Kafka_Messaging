package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MensagensApplication {

	public static void main(String[] args) {
		SpringApplication.run(MensagensApplication.class, args);
		System.out.println("\n*KAFKA*\n");
	}
}
 