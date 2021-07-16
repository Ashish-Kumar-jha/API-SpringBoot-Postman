package com.ksolves.employee.EmployeeDataCsv.Models;
public class EmployeeData {

    private String id;
    private String name;
    private String email;
    private String salary;
    private String city;
    private String state;
    private String country;
    public EmployeeData(){

    }
    public EmployeeData(String id, String name, String email, String salary, String city, String state, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
