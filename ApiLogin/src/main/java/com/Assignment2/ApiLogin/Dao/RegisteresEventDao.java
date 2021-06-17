package com.Assignment2.ApiLogin.Dao;

import com.Assignment2.ApiLogin.Entity.RegisteredEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisteresEventDao extends JpaRepository<RegisteredEvent,Integer> {

}
