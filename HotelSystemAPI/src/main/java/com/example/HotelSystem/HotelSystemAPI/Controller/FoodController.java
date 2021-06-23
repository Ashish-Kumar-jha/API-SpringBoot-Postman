package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Entity.FoodEntity;
import com.example.HotelSystem.HotelSystemAPI.Service.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    Food food;
    @GetMapping("/food/showfoods")
    public List<FoodEntity> showFoods()
    {
        return this.food.showFoods();
    }
    @PostMapping("/food/addfoods")
    public FoodEntity addFoods(@RequestBody FoodEntity foodbody){
        return this.food.addFoods(foodbody);
    }

    @DeleteMapping("/food/{foodId}")
    public String deleteFood(@PathVariable String foodId){
        return this.food.deleteFood(Integer.parseInt(foodId));
    }

    @PutMapping("/food/update/{foodId}")
    public FoodEntity updateStaff(@RequestBody FoodEntity foodbody, @PathVariable String foodId){
        return this.food.updateFood(foodbody,Integer.parseInt(foodId));
    }
}
