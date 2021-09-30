package com.Hibernate.HiberCrud.Controller;

import com.Hibernate.HiberCrud.Entity.PersonalDetails;
import com.Hibernate.HiberCrud.Service.PersonalInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/HiberCrud")
public class MyController {
    @Autowired
    PersonalInter personalInter;
    @PostMapping("/savedata")
    public String savedata(@RequestBody PersonalDetails personalDetails){
   return personalInter.savedata(personalDetails);
   }

   @GetMapping("/getdata")
    public List<PersonalDetails> getdata(){
        return personalInter.getdata();
   }
}
