package com.test.microone.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.microone.model.User;


/**
 * 
 * @author Ashish Jha
 *
 */

@CrossOrigin("*")
@RestController()
@RequestMapping("/One")
public class TestController {
	Logger logger = LogManager.getLogger(TestController.class);
	
	@GetMapping(value = "/test1")
	public ResponseEntity<?> getTestMessage() {
		User user = new User();
		user.setId(11708214);
		user.setName("ASHISH KUMAR JHA");
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

@GetMapping("/cone")
	public String check(){
		return "MICRO CONTROLLER 1 INVOCKED";
}
}
