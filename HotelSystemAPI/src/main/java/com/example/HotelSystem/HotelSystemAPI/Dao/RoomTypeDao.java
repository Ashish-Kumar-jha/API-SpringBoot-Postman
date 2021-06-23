package com.example.HotelSystem.HotelSystemAPI.Dao;

import com.example.HotelSystem.HotelSystemAPI.Entity.RoomTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomTypeDao extends JpaRepository<RoomTypeEntity,Integer> {
}
