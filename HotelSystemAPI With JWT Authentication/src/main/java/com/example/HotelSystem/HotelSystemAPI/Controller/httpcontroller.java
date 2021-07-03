package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Entity.httpcheck;
import com.example.HotelSystem.HotelSystemAPI.Service.http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class httpcontroller {
    @Autowired
    http h;


    @GetMapping("/http/{id}")
    public httpcheck checkhttp(@PathVariable String id)
    {
        return this.h.checkhttp(Integer.parseInt(id));
    }


    @PostMapping("/http")
    public httpcheck savecheckhttp(@RequestBody httpcheck HTTP)
    {
        return this.h.savecheckhttp(HTTP);
    }
}
