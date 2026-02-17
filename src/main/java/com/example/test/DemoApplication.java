package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {
	
@Autowired RestTemplate restTemplate;	

	public static void main(String[] args) {
		System.out.println("Hello World from MySecondSpringProject");
		SpringApplication.run(DemoApplication.class, args);
	}

}
