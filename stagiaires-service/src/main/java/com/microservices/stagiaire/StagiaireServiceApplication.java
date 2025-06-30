package com.microservices.stagiaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StagiaireServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagiaireServiceApplication.class, args);
	}

}
