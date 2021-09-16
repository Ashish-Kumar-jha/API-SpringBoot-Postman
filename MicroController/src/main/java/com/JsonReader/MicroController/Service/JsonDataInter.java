package com.JsonReader.MicroController.Service;

import com.JsonReader.MicroController.Entity.Data1;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface JsonDataInter {
    public void savedata1() throws FileNotFoundException;

   public List<Data1> fetchDatedata(LocalDate fromdate, LocalDate todate);

    public List<Data1> fetchTimedata(LocalTime fromtime, LocalTime totime);

    public Data1 getdataByid(int id);

   public List<Data1> ShowData();

    public void DeletedataById(int id);
}
