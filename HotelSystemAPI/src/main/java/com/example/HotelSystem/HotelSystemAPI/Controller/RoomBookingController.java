package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Entity.RoomBookingEntity;
import com.example.HotelSystem.HotelSystemAPI.Service.RoomBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomBookingController {
    @Autowired
    RoomBook room;
    //SHOW ALL USER
    @GetMapping("/booking/showCustomer")
    public List<RoomBookingEntity> showAllCustomer(){
        return this.room.showAllCustomer();
    }
    //GET SPECIFIC CUSTOMER
    @GetMapping("/booking/showCustomer/{customerId}")
    public RoomBookingEntity showCustomer(@PathVariable String customerId){
        return this.room.showCustomer(Integer.parseInt(customerId));
    }

    //ADD CUSTOMER TO HOTEL LIST
    @PostMapping("/booking")
    public RoomBookingEntity addCustomer(@RequestBody RoomBookingEntity roomobj){
        return this.room.addCustomer(roomobj);
    }



}
