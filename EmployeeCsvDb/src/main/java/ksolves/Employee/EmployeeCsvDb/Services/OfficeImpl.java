package ksolves.Employee.EmployeeCsvDb.Services;

import ksolves.Employee.EmployeeCsvDb.Dao.OfficeDao;
import ksolves.Employee.EmployeeCsvDb.Models.OfficeData;
import ksolves.Employee.EmployeeCsvDb.Models.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

@Service
public class OfficeImpl implements  Office{


    @Autowired
    OfficeDao of;


    @Override
    public void SaveOfficeData(Request reqObj) {

        int pageNo=reqObj.getPageNo();
        int pageSize=reqObj.getPageSize();
        String row="";
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("E:\\Hr1m.csv"));
            int count=0;
            row=br.readLine();
            for (int i = 0; i < (pageNo - 1) * pageSize; i++)
                row = br.readLine();
            while ((row = br.readLine()) != null && count < pageSize) {
                String[] data = row.split(",");
                OfficeData od = new OfficeData(data[0], data[2], data[35], data[25], data[21]);
                of.save(od);
                count++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
