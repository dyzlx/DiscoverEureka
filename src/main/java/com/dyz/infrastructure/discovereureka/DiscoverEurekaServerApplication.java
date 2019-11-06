package com.dyz.infrastructure.discovereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverEurekaServerApplication.class, args);
	}
}
