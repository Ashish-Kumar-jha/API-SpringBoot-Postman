package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Entity.FoodEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.StaffEntity;
import com.example.HotelSystem.HotelSystemAPI.Service.Food;
import com.example.HotelSystem.HotelSystemAPI.Service.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {


    @Autowired
    Staff staff;


@GetMapping("/staff/showstaffs")
    public List<StaffEntity> showStaffs()
      {
        return this.staff.showStaffs();
      }
@PostMapping("/staff/addstaffs")
    public StaffEntity addStaff(@RequestBody StaffEntity staffbody){
        return this.staff.addStaffs(staffbody);
}

@DeleteMapping("/staff/{staffemail}")
    public String deleteStaff(@PathVariable String staffemail){
        return this.staff.deleteStaff(staffemail);
}

@PutMapping("/staff/update/{staffEmail}")
    public StaffEntity updateStaff(@RequestBody StaffEntity staffbody, @PathVariable String staffEmail){
    return this.staff.updateStaff(staffbody,staffEmail);
}




}
