package com.bbidag.microservice.scm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudMicroserviceScmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceScmApplication.class, args);
	}

}
