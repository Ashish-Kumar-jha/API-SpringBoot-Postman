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

    //SHOW ALL STAFF "GET METHOD"
    @Override
    public List<StaffEntity> showStaffs() {
        return staffdao.findAll();
    }

    //ADD ALL STAFF  "POST METHOD"
    @Override
    public StaffEntity addStaffs(StaffEntity staffbody)
    {
        if(staffbody.getStaffage()>25)
        return staffdao.save(staffbody);
            return null;
    }

    //DELETE USER "DELETE METHOD"
    @Override
    public String deleteStaff(String staffemail) {

        StaffEntity entity = staffdao.getById(staffemail);
         staffdao.delete(entity);
        return "ALL DETAILS HAS BEEN REMOVED FOR "+ staffemail;

    }

    //UPDATE USER "UPDATE METHOD"
    @Override
    public StaffEntity updateStaff(StaffEntity staffbody, String staffEmail) {
//        StaffEntity s=null;
//        for(StaffEntity se:staffdao.findAll()){
//            if(se.getStaffemail().equals(staffEmail)){
//               se.setStaffpno(staffbody.getStaffpno());
//            }
//        }
        return staffdao.save(staffbody);
    }

}
