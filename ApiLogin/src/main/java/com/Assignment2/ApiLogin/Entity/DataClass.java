package com.Assignment2.ApiLogin.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DataClass {


    @Id
    int id;
    String email;
    String name;
    String password;
    long pno;

    public DataClass(int id, String email, String name, String password, long pno) {
        super();
        this.id=id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.pno = pno;
    }

    public DataClass() {
    }


    //getters
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public long getPno() {
        return pno;
    }


    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPno(long pno) {
        this.pno = pno;
    }

}
