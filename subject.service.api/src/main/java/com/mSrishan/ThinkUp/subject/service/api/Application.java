package com.mSrishan.ThinkUp.subject.service.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient; // Instead of EnableEurekaClient

@SpringBootApplication
@EnableDiscoveryClient  // Use this for Spring Boot 3.x+ (instead of EnableEurekaClient)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
