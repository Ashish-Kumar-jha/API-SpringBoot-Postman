package com.example.HotelSystem.HotelSystemAPI.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class httpcheck {
    @Id
    int id;
    @Column(nullable = false)
    String name;
    public httpcheck(){

    }
    public httpcheck(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
