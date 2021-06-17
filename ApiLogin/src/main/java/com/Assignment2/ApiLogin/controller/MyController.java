package com.Assignment2.ApiLogin.controller;

import com.Assignment2.ApiLogin.Entity.DataClass;
import com.Assignment2.ApiLogin.Entity.EventClass;
import com.Assignment2.ApiLogin.Entity.RegisteredEvent;
import com.Assignment2.ApiLogin.Services.Servicees;
import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private Servicees service;


    //Get the courses
    @GetMapping("/user")
    public List<DataClass> getUser()
    {
        return service.getUser();
    }

    //Get the single course
    @GetMapping("/user/{userId}")
    public DataClass getCourse(@PathVariable String userId)
    {
        return service.getUserById(Integer.parseInt(userId));
    }


    //Add courses or PUT operation
    @PostMapping("/user")
    public DataClass addCourse(@RequestBody DataClass userdata) {
        return service.addUser(userdata);
    }

    //update data or PUT operation
    @PutMapping("/user/{user}")
    public DataClass UpdateCourse(@RequestBody DataClass data ){
        return this.service.updateUser(data);
    }

    //DELETE data or DELETE operation
    @DeleteMapping("/user/{userId}")
    public void deleteCourse(@PathVariable String userId){
        this.service.deleteUser(Integer.parseInt(userId));
    }

    //FOR LOGIN VALIDATION
    @PostMapping("/login")
    public String loginvalid(@RequestBody DataClass data){
        return this.service.loginValid(data);
    }

    @PostMapping("/events")
    public EventClass addEvent(@RequestBody EventClass edata){
        return this.service.addEvent(edata);
    }

    @GetMapping("/events")
    public List<EventClass> showEvent(){
        return this.service.showEvent();
    }

    @PostMapping("/eventreg/{Uid}/{EventId}")
    public String registerEvent( @PathVariable String Uid, @PathVariable String EventId){
        return this.service.registerEvent(Integer.parseInt(Uid),Integer.parseInt(EventId));
    }

}
