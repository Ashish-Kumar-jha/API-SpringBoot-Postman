package com.ksolves.employee.EmployeeDataCsv.Servicees;

import com.ksolves.employee.EmployeeDataCsv.Models.EmployeeData;
import com.ksolves.employee.EmployeeDataCsv.Models.Request;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServices implements Employee {
    @Override
    public List<EmployeeData> fetchdata(Request reqObj) {
        int pageNo=reqObj.getPageNo();
        int pageSize=reqObj.getPageSize();
        List<EmployeeData> Empdata= new ArrayList<EmployeeData>();
        String row="";
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("E:\\Hr1m.csv"));
            int count=0;
            row=br.readLine();
            if((pageNo-1)*pageSize>=0 && (pageNo-1)*pageSize<=100000) {


                for (int i = 0; i < (pageNo - 1) * pageSize; i++)
                    row = br.readLine();

                while ((row = br.readLine()) != null && count < pageSize) {
                    String[] data = row.split(",");
                    EmployeeData emp = new EmployeeData(data[0], data[2], data[6], data[25], data[31], data[32], data[30]);
                    Empdata.add(emp);
                    count++;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return Empdata;
    }
}
