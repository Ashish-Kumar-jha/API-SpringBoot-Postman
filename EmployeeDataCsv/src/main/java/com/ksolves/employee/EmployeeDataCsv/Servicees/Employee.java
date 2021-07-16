package com.ksolves.employee.EmployeeDataCsv.Servicees;

import com.ksolves.employee.EmployeeDataCsv.Models.EmployeeData;
import com.ksolves.employee.EmployeeDataCsv.Models.Request;

import java.util.List;

public interface Employee {
   public List<EmployeeData> fetchdata(Request reqObj);
}
