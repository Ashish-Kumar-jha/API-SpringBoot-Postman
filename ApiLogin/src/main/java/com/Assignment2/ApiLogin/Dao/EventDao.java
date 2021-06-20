package com.Assignment2.ApiLogin.Dao;

import com.Assignment2.ApiLogin.Entity.EventClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDao extends JpaRepository<EventClass,Integer> {

}
