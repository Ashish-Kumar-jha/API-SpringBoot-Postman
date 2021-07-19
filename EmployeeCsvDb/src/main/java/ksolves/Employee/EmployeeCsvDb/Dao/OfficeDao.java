package ksolves.Employee.EmployeeCsvDb.Dao;

import ksolves.Employee.EmployeeCsvDb.Models.OfficeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeDao extends JpaRepository<OfficeData,String> {
}
