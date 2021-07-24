package ksolves.Employee.EmployeeCsvDb.Controllers;

import ksolves.Employee.EmployeeCsvDb.Services.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/Employee")
public class DataController {
    @Autowired
    UserData userData;

    @PostMapping("/saveData")
    public void SaveData(){
        this.userData.SaveData();

    }

}
