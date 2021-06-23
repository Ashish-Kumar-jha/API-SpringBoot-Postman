package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Dao.RoomBookingDao;
import com.example.HotelSystem.HotelSystemAPI.Entity.RoomBookingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomBookImpl implements RoomBook{

    @Autowired
    RoomBookingDao roomdao;

    //SHOW ALL CUSTOMERS
    @Override
    public List<RoomBookingEntity> showAllCustomer() {
        return roomdao.findAll();
    }

    //SHOW SPECIFIC CUSTOMER DETAILS
    @Override
    public RoomBookingEntity showCustomer(int bookingid) {
        RoomBookingEntity re=null;
        for(RoomBookingEntity r:roomdao.findAll()){
            if(r.getBid()==bookingid){
                re=r;
                break;
            }
        }
        return re;
    }

    //ADD CUSTOMER TO HOTEL
    @Override
    public RoomBookingEntity addCustomer(RoomBookingEntity roomobj) {
        return roomdao.save(roomobj);
    }
}
