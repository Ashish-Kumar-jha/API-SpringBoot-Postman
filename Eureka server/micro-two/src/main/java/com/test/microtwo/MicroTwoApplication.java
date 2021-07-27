package com.test.microtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroTwoApplication.class, args);
	}

}
