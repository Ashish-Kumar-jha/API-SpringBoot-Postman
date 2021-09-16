package com.JsonReader.MicroController.Controller;
import com.JsonReader.MicroController.Entity.Data1;
import com.JsonReader.MicroController.Repository.Repo1;
import com.JsonReader.MicroController.Service.JsonDataInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@RestController
@RequestMapping("/Android")
public class MyController {

    @Autowired
    JsonDataInter jsonDataInter;
    @Autowired
    Repo1 repo1;

    /*To save data from json file to database*/
    @GetMapping("/Save1")
    public void SaveData1() throws IOException{
        this.jsonDataInter.savedata1();
    }
    /*To get data for specific id*/
    @GetMapping("/getDataById/{id}")
    public Data1 getdatabyid(@PathVariable int id){
        System.out.println("GET DATA CONTROLLER CALLED");
       return this.jsonDataInter.getdataByid(id);
    }
    /*To get data between specific dates*/
    @GetMapping("/DateBetw")
    public List<Data1> fetchDatedata(@RequestParam String fromdate, @RequestParam String todate){
            return this.jsonDataInter.fetchDatedata(LocalDate.parse(fromdate),LocalDate.parse(todate));
    }
    /*To get data between specific times*/
    @GetMapping("/TimeBetw")
    public List<Data1> fetchTimedata(@RequestParam String fromtime, @RequestParam String totime){
        return this.jsonDataInter.fetchTimedata(LocalTime.parse(fromtime),LocalTime.parse(totime));
    }

    /*To delete specific Id*/
    @DeleteMapping("/DeleteById/{id}")
    public void deleteById(@PathVariable int id){
        this.jsonDataInter.DeletedataById(id);
    }
    /*To print all data from database*/
    @GetMapping("/ShowData")
    public List<Data1> getdata1(){
       return jsonDataInter.ShowData();
    }
}