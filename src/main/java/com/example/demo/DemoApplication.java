package com.example.demo;

import ch.qos.logback.core.net.server.Client;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
@PostConstruct
List<Client> addClent(){
		ArrayList<Client>clients = new ArrayList<>();
		return clients;
}
}
