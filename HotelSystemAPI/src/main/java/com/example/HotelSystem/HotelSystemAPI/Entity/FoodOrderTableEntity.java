package com.example.HotelSystem.HotelSystemAPI.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodOrderTableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int sno;
    int bid;
    String foodname;
    int price;
    int noofpice;

    public FoodOrderTableEntity(){

    }
    public FoodOrderTableEntity(int bid, String foodname, int price, int noofpice) {
        this.bid = bid;
        this.foodname = foodname;
        this.price = price;
        this.noofpice = noofpice;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoofpice() {
        return noofpice;
    }

    public void setNoofpice(int noofpice) {
        this.noofpice = noofpice;
    }


}
