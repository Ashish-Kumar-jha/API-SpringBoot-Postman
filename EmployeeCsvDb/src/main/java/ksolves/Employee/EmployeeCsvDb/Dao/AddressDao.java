package ksolves.Employee.EmployeeCsvDb.Dao;

import ksolves.Employee.EmployeeCsvDb.Models.AddressData;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressDao extends JpaRepository<AddressData,String> {
}
