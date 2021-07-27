package com.test.microdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroDiscoveryApplication.class, args);
	}

}
