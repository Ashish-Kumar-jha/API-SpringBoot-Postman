package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Entity.FoodEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.FoodOrderTableEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.httpcheck;
import com.example.HotelSystem.HotelSystemAPI.Service.Food;
import com.example.HotelSystem.HotelSystemAPI.Service.http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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




    //FOOD ORDER FOR SPECIFIC USERS
    @GetMapping("/foodbook/showfoodbook/{id}")
    public List<FoodOrderTableEntity> showFoodBookUser(@PathVariable int id)
    {
        return this.food.showFoodBookUser(id);
    }


    @GetMapping("/foodbook/showfoodbook")
    public List<FoodOrderTableEntity> showFoodBook()
    {
        return this.food.showFoodBook();
    }

    @PostMapping("/foodbook/addfoodbook")
    public FoodOrderTableEntity addFoodBook(@RequestBody FoodOrderTableEntity foodorderobj){
        return this.food.addFoodBook(foodorderobj);
    }

}
