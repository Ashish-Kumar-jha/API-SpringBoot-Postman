package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Entity.StaffEntity;
import com.example.HotelSystem.HotelSystemAPI.Service.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelSystemController {


    @Autowired
    Staff staff;

@GetMapping("/staff/showstaffs")
    public List<StaffEntity> showStaffs(){
        return this.staff.showStaffs();
}
@PostMapping("/staff/addstaffs")
    public StaffEntity addStaff(@RequestBody StaffEntity staffbody){
        return this.staff.addStaffs(staffbody);
}
@DeleteMapping("/staff/{staffemail}")
    public StaffEntity deleteStaff(@PathVariable String staffemail){
        return this.staff.deleteStaff(staffemail);
}



}
