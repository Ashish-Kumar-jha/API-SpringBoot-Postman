package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Dao.FoodDao;
import com.example.HotelSystem.HotelSystemAPI.Dao.FoodOrderTableDao;
import com.example.HotelSystem.HotelSystemAPI.Dao.httpcheckdao;
import com.example.HotelSystem.HotelSystemAPI.Entity.FoodEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.FoodOrderTableEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.httpcheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FoodImpl implements  Food{
    @Autowired
    FoodDao fooddao;

    @Autowired
    FoodOrderTableDao foodorderdao;

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


    /*****************FOOD ORDER**************/
    @Override
    public List<FoodOrderTableEntity> showFoodBook() {
        return foodorderdao.findAll();
    }

    @Override
    public FoodOrderTableEntity addFoodBook(FoodOrderTableEntity foodorderobj) {
        String foodname=foodorderobj.getFoodname();
        int price=0;
        int noofpice=foodorderobj.getNoofpice();
        for(FoodEntity fe:fooddao.findAll()){
            if(fe.getItemname().equalsIgnoreCase(foodname)){
                price=fe.getPrice();
                break;
            }

        }
        foodorderobj.setPrice(price*noofpice);
        return foodorderdao.save(foodorderobj);
    }

    @Override
    public List<FoodOrderTableEntity> showFoodBookUser(int id) {
        List<FoodOrderTableEntity> ee=new ArrayList<FoodOrderTableEntity>();

        for(FoodOrderTableEntity e:foodorderdao.findAll()){
            if(e.getBid()==id){
                ee.add(e);
            }
        }
        if(ee.isEmpty()){
            return null;
        }
        return ee;
    }




}
