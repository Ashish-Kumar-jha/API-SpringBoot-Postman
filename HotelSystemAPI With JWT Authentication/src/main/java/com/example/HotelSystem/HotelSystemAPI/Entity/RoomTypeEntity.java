package com.example.HotelSystem.HotelSystemAPI.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomid;
    private String roomtype;
    private int roomtypeprice;

    public RoomTypeEntity(String roomtype, int roomtypeprice) {
        this.roomtype = roomtype;
        this.roomtypeprice = roomtypeprice;
    }
    public RoomTypeEntity(){

    }

    public int getRoomid() {
        return roomid;
    }
    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getRoomtype()
    {
        return roomtype;
    }

    public void setRoomtype(String roomtypeprice) {
        this.roomtype = roomtypeprice;
    }

    public int getRoomtypeprice() {
        return roomtypeprice;
    }

    public void setRoomtypeprice(int roomtypeprice)
    {
        this.roomtypeprice = roomtypeprice;
    }
}
