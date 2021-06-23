package com.example.HotelSystem.HotelSystemAPI.Dao;

import com.example.HotelSystem.HotelSystemAPI.Entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodDao extends JpaRepository<FoodEntity,Integer> {

}
