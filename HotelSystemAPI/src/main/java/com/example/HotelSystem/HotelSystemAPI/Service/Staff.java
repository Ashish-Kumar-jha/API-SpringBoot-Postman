package com.example.HotelSystem.HotelSystemAPI.Service;


import com.example.HotelSystem.HotelSystemAPI.Entity.StaffEntity;

import java.util.List;

public interface Staff {
    public List<StaffEntity> showStaffs();
    public StaffEntity addStaffs(StaffEntity staffbody);
    public String deleteStaff(String staffemail);
    public StaffEntity updateStaff(StaffEntity staffbody,String staffEmail);
}
