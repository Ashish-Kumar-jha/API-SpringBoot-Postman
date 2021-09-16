package com.JsonReader.MicroController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MicroControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroControllerApplication.class, args);
	}

}
