package ksolves.Employee.EmployeeCsvDb.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressData {
    @Id
    private String EmpId;
    private String Name;
    private String Country,City,State,Region,Zip;
    public AddressData(){}
    public AddressData(String empId, String name, String country, String city, String state, String region, String zip) {
        EmpId = empId;
        Name = name;
        Country = country;
        City = city;
        State = state;
        Region = region;
        Zip = zip;
    }
}
