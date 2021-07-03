package com.example.HotelSystem.HotelSystemAPI.Request;

import javax.persistence.Column;

public class LoginRequest {
    String cname;
    String password;
    public LoginRequest(){

    }
    public LoginRequest(String cname, String password) {
        this.cname = cname;
        this.password = password;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
