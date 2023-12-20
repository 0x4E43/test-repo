package com.example.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
	}


	@GetMapping(path = "/test/test-app")
	public String testApp(){
		return "App working fine";
	}
	@GetMapping
	public String test(){
		return "TEST-SERVICE";
	}

	@GetMapping(path = "/test")
	public String testTest(){
		return "TEST-SERVICE";
	}

}
