package ksolves.Employee.EmployeeCsvDb.Dao;

import ksolves.Employee.EmployeeCsvDb.Models.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDao extends JpaRepository<PersonalData,String> {
}
