package com.JsonReader.MicroController.Service;

import com.JsonReader.MicroController.Entity.Data1;
import com.JsonReader.MicroController.Repository.Repo1;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class JsonData implements JsonDataInter {

    @Autowired
    Repo1 repo1;
    //E:\MicroController\src\main\resources\JsonFile

    @Override
    public void savedata1() throws FileNotFoundException {
        try{
            ObjectMapper mapper=new ObjectMapper();
            InputStream inputStream=new FileInputStream(new File("E:\\MicroController\\src\\main\\resources\\JsonFile\\Data1.json"));
            TypeReference<List<Data1>> typeReference = new TypeReference<List<Data1>>(){};
            List<Data1> data1=mapper.readValue(inputStream,typeReference);
            ArrayList<Data1> savdata1=new ArrayList<Data1>();
            for(Data1 d:data1){
                Data1 da1=new Data1(d.getLongitude(),d.getLatitude(),LocalTime.now(), LocalDate.now());
                savdata1.add(da1);
            }
    repo1.saveAll(savdata1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception occurred : "+ e);
        }
    }

    @Override
    public List<Data1> ShowData() {
        System.out.println("All data");
        return  repo1.findAll();

    }

    @Override
    @CacheEvict("jsondata")
    public void DeletedataById(int id) {
        System.out.println("Deleted from db");
        repo1.deleteById(id);
    }

    @Override
    public List<Data1> fetchDatedata(LocalDate fromdate, LocalDate todate) {
        return repo1.findBydateBetween(fromdate,todate);
    }

    @Override
    public List<Data1> fetchTimedata(LocalTime fromtime, LocalTime totime) {
        return repo1.findBytimeBetween(fromtime,totime);
    }

    @Override
    @Cacheable("jsondata")
    public Data1 getdataByid(int id) {
        System.out.println("Getting from Db");
        Data1 d = null;
        for (Data1 dd : repo1.findAll()) {
            if (dd.getId() == id) {
                d = dd;
            }
        }
        if(d==null){
            throw  new NullPointerException();
        }
        return d;
    }


}
