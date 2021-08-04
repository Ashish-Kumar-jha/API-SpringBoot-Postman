package com.test.microone;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroOneApplication {
	static Logger logger = LoggerFactory.getLogger(MicroOneApplication.class);
	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(MicroOneApplication.class, args);

	}

}
