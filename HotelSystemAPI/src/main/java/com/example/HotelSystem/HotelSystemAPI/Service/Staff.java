package com.example.HotelSystem.HotelSystemAPI.Service;


import com.example.HotelSystem.HotelSystemAPI.Entity.StaffEntity;

import java.util.List;

public interface Staff {
    public List<StaffEntity> showStaffs();

    public StaffEntity addStaffs(StaffEntity staffbody);

    public StaffEntity deleteStaff(String staffemail);
}
