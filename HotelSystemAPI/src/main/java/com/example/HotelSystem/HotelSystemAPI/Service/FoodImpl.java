package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Dao.FoodDao;
import com.example.HotelSystem.HotelSystemAPI.Entity.FoodEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodImpl implements  Food{
    @Autowired
    FoodDao fooddao;

    //SHOW ALL FOOD ITEM
    @Override
    public List<FoodEntity> showFoods() {
        return fooddao.findAll();
    }

    //ADD FOOD ITEM
    @Override
    public FoodEntity addFoods(FoodEntity foodbody) {
        return fooddao.save(foodbody);
    }

    //DELETE FOOD ITEM
    @Override
    public String deleteFood(int Itemid) {
        FoodEntity fe=fooddao.getById(Itemid);
        fooddao.delete(fe);
        return "FOOD ID: "+ Itemid+" REMOVED...";
    }

    @Override
    public FoodEntity updateFood(FoodEntity foodbody, int parseInt) {
        return fooddao.save(foodbody);
    }
}
