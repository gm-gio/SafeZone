package com.myproject.safezone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SafeZoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafeZoneApplication.class, args);
		System.out.println("Safe Zone");
	}
}
