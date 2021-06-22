package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Dao.StaffDao;
import com.example.HotelSystem.HotelSystemAPI.Entity.StaffEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StaffImpl implements Staff{

    @Autowired
    StaffDao staffdao;
    @Override
    public List<StaffEntity> showStaffs() {
        return staffdao.findAll();
    }

    @Override
    public StaffEntity addStaffs(StaffEntity staffbody)
    {
        if(staffbody.getStaffage()>25)
        return staffdao.save(staffbody);

            return null;

    }

    @Override
    public StaffEntity deleteStaff(String staffemail) {
        return null;
    }

}
