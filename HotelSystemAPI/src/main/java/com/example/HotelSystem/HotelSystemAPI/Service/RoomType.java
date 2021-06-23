package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Entity.RoomTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomType {

    public List<RoomTypeEntity> showRoomType();
    public RoomTypeEntity addRoomType(RoomTypeEntity roomtypeobj);
}
