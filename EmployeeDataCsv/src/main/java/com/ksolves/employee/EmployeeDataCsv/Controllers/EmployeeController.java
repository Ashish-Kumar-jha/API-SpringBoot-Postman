package com.ksolves.employee.EmployeeDataCsv.Controllers;

import com.ksolves.employee.EmployeeDataCsv.Models.EmployeeData;
import com.ksolves.employee.EmployeeDataCsv.Models.Request;
import com.ksolves.employee.EmployeeDataCsv.Servicees.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    Employee employee;

    @PostMapping("/fetchData")
    public List<EmployeeData> fetchdata(@RequestBody Request reqObj)
    {
        return this.employee.fetchdata(reqObj);
    }
}
