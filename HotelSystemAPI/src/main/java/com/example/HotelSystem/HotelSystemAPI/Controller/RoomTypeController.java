package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Entity.RoomTypeEntity;
import com.example.HotelSystem.HotelSystemAPI.Service.RoomType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomTypeController {
    @Autowired
    RoomType room;

    @GetMapping("/roomtype/showall")
    public List<RoomTypeEntity> showRoomType(){
        return this.room.showRoomType();
    }
    @PostMapping("/roomtype")
    public RoomTypeEntity addRoomType(@RequestBody RoomTypeEntity roomtypeobj){
        return this.room.addRoomType(roomtypeobj);
    }


}
