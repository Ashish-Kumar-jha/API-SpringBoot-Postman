package com.test.microtwo.controller;

import com.test.microtwo.model.Interns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.test.microtwo.model.User;

@RestController
public class TestController {
	@Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

	@GetMapping("/hello")
	public ResponseEntity<?> hello() {
		Application application = eurekaClient.getApplication("MICRO-ONE");
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/" + "api/v1/test";
        System.out.println("URL : " + url);
        User user = restTemplate.getForObject(url, User.class);
        System.out.println("RESPONSE id : " + user.getId() + " name : " + user.getName());
        return new ResponseEntity<>(user, HttpStatus.OK);	
	}
	@GetMapping("/hello1")
    public ResponseEntity<?> fetch(){
        Application application = eurekaClient.getApplication("MICRO-THREE");
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/" + "three/api/save";
        System.out.println("URL : " + url);
        Interns interns=restTemplate.getForObject(url,Interns.class);
        return new ResponseEntity<>(interns, HttpStatus.OK);
    }
}