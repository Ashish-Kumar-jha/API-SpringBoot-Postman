package ksolves.Employee.EmployeeCsvDb.Services;

import ksolves.Employee.EmployeeCsvDb.Dao.OfficeDao;
import ksolves.Employee.EmployeeCsvDb.Dao.PersonalDao;
import ksolves.Employee.EmployeeCsvDb.Models.OfficeData;
import ksolves.Employee.EmployeeCsvDb.Models.PersonalData;
import ksolves.Employee.EmployeeCsvDb.Models.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;

@Service
public class PersonalImpl implements Personal{

    @Autowired
    PersonalDao pd;

    @Override
    public void SavePersonalData(Request reqObj) {
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
                PersonalData od = new PersonalData(data[0], data[2], data[6], data[10], data[8], data[7], data[28]);
                pd.save(od);
                count++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
