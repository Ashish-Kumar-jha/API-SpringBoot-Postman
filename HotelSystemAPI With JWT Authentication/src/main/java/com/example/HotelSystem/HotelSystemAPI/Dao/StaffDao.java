package com.example.HotelSystem.HotelSystemAPI.Dao;

import com.example.HotelSystem.HotelSystemAPI.Entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<StaffEntity,String> {
}
