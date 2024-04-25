package com.auth1.auth.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthLearningApplication.class, args);
	}

}
