package ksolves.Employee.EmployeeCsvDb.Controllers;

import ksolves.Employee.EmployeeCsvDb.Models.AddressData;
import ksolves.Employee.EmployeeCsvDb.Models.OfficeData;
import ksolves.Employee.EmployeeCsvDb.Models.PersonalData;
import ksolves.Employee.EmployeeCsvDb.Models.Request;
import ksolves.Employee.EmployeeCsvDb.Services.Address;
import ksolves.Employee.EmployeeCsvDb.Services.Office;
import ksolves.Employee.EmployeeCsvDb.Services.Personal;
import ksolves.Employee.EmployeeCsvDb.Services.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class DataController {
    @Autowired
    Address address;

    @Autowired
    Office office;

    @Autowired
    Personal personal;

    @Autowired
    UserData userData;
    @PostMapping("/saveData")
    public void SaveData(@RequestBody Request reqObj){
        this.userData.SaveData(reqObj);
    }

//    @PostMapping("/personal")
//    public void SavePersonalData(@RequestBody Request reqObj){
//        this.personal.SavePersonalData(reqObj);
//    }
//    @PostMapping("/office")
//    public void SaveOfficeData(@RequestBody Request reqObj)
//    {
//        this.office.SaveOfficeData(reqObj);
//    }
//    @PostMapping("/address")
//    public void SaveAddressData(@RequestBody Request reqObj){
//        this.address.SaveAddressData(reqObj);
//    }
}
