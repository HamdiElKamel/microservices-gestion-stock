package com.microservices.configzull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigZullApplication.class, args);
	}

}
