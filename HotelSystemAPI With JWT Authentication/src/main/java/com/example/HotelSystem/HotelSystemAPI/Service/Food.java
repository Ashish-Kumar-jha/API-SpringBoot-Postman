package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Entity.FoodEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.FoodOrderTableEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.httpcheck;

import java.util.List;

public interface Food {
   public List<FoodEntity> showFoods();
   public FoodEntity addFoods(FoodEntity foodbody);
   public String deleteFood(int parseInt);
   public FoodEntity updateFood(FoodEntity foodbody, int parseInt);



   public List<FoodOrderTableEntity> showFoodBook();
   public FoodOrderTableEntity addFoodBook(FoodOrderTableEntity foodorderobj);
   public List<FoodOrderTableEntity> showFoodBookUser(int id);


}
