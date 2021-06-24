package com.example.HotelSystem.HotelSystemAPI.Dao;

import com.example.HotelSystem.HotelSystemAPI.Entity.FoodOrderTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodOrderTableDao extends JpaRepository<FoodOrderTableEntity,Integer> {
}
