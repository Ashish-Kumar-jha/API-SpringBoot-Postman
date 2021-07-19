package ksolves.Employee.EmployeeCsvDb.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonalData {
    @Id
    private String EmpId;
    private String Name;
    private String Email;
    private String Dob;
    private String Mothername;
    private String Fathername;
    private String PhoneNo;
    public PersonalData(){}
    public PersonalData(String empId, String name, String email, String dob, String mothername, String fathername, String phoneNo) {
        EmpId = empId;
        Name = name;
        Email = email;
        Dob = dob;
        Mothername = mothername;
        Fathername = fathername;
        PhoneNo = phoneNo;
    }
}
