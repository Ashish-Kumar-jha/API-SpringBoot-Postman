package com.example.HotelSystem.HotelSystemAPI.Entity;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvoiceCheckoutEntity {
@Id
int bid;
String roomtype;
int roomprice;
int foodprice;
long noofdays;
int total;
    public InvoiceCheckoutEntity(){}
    public InvoiceCheckoutEntity(int bid, String roomtype, int roomprice, int foodprice, long noofdays, int total) {
        this.bid = bid;
        this.roomtype = roomtype;
        this.roomprice = roomprice;
        this.foodprice = foodprice;
        this.noofdays = noofdays;
        this.total = total;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public int getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(int roomprice) {
        this.roomprice = roomprice;
    }

    public int getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(int foodprice) {
        this.foodprice = foodprice;
    }

    public long getNoofdays() {
        return noofdays;
    }

    public void setNoofdays(long noofdays) {
        this.noofdays = noofdays;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
