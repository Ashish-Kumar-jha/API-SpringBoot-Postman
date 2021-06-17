package com.Assignment2.ApiLogin.Dao;

import com.Assignment2.ApiLogin.Entity.DataClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataDao extends JpaRepository<DataClass,Integer> {

}
