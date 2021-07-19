package ksolves.Employee.EmployeeCsvDb.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class OfficeData {
    @Id
    private String EmpId;
    private String EmpName;
    private String UserName;
    private String EmpSalary;
    private String Doj;
    public OfficeData(){}
    public OfficeData(String empId, String empName, String userName, String empSalary, String doj) {
        EmpId = empId;
        EmpName = empName;
        UserName = userName;
        EmpSalary = empSalary;
        Doj = doj;
    }
}
