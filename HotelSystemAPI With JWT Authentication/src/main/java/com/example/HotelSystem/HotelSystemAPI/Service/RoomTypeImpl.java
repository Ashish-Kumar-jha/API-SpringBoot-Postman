package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Dao.RoomTypeDao;
import com.example.HotelSystem.HotelSystemAPI.Entity.RoomTypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomTypeImpl implements RoomType{
    @Autowired
    RoomTypeDao roomtypedao;

    @Override
    public List<RoomTypeEntity> showRoomType() {
        return roomtypedao.findAll();
    }

    @Override
    public RoomTypeEntity addRoomType(RoomTypeEntity roomtypeobj) {
        return roomtypedao.save(roomtypeobj);
    }

}
