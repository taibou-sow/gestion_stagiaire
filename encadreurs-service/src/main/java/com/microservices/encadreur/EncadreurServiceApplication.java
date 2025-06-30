package com.microservices.encadreur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EncadreurServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncadreurServiceApplication.class, args);
	}

}
