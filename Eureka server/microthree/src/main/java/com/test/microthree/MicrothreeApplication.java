package com.test.microthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

public class MicrothreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrothreeApplication.class, args);
	}

}
