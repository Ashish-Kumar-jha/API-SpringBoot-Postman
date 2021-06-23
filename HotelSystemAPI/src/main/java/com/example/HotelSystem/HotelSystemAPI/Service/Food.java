package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Entity.FoodEntity;

import java.util.List;

public interface Food {
   public List<FoodEntity> showFoods();
   public FoodEntity addFoods(FoodEntity foodbody);
   public String deleteFood(int parseInt);
   public FoodEntity updateFood(FoodEntity foodbody, int parseInt);
}
