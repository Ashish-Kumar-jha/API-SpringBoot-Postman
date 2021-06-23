package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Entity.RoomBookingEntity;

import java.util.List;

public interface RoomBook {
   public List<RoomBookingEntity> showAllCustomer();
   public RoomBookingEntity showCustomer(int parseInt);
   public RoomBookingEntity addCustomer(RoomBookingEntity roomobj);
}
