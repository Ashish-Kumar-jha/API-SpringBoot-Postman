package com.example.crud.CrudH2Database.Repository;

import com.example.crud.CrudH2Database.Entity.StudentDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDescriptionRepo extends JpaRepository<StudentDescription, Integer> {
//    String query="select * fom H2Crud.STUDENT_DESC where id=?";
//    @Query(value = query,nativeQuery = true)
//    List<StudentDescription> extractDataFromId(@Param("id") Integer id);
}
