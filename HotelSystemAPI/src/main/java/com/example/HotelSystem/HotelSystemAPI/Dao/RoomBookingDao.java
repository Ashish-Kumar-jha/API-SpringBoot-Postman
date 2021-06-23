package com.example.HotelSystem.HotelSystemAPI.Dao;
import com.example.HotelSystem.HotelSystemAPI.Entity.RoomBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomBookingDao extends JpaRepository <RoomBookingEntity,Integer> {
}
