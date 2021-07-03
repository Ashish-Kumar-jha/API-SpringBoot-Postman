package com.example.HotelSystem.HotelSystemAPI.Request;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import java.time.LocalDate;

public class SignupRequest {

    String cname;
    int cage;
    String caadhaar;
    String email;
    long contact;
    String password;
    String roomtype;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="dd-MM-yyyy")
    private LocalDate checkin;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="dd-MM-yyyy")
    private LocalDate checkout;
//    public SignupRequest(){
//
//    }
//    public SignupRequest(String cname, int cage, String caadhaar, long contact, LocalDate checkin, LocalDate checkout,String email,String roomtype,String password) {
//        this.cname = cname;
//        this.cage = cage;
//        this.caadhaar = caadhaar;
//        this.contact = contact;
//        this.checkin = checkin;
//        this.checkout = checkout;
//        this.email=email;
//        this.password=password;
//        this.roomtype=roomtype;
//    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    public String getCaadhaar() {
        return caadhaar;
    }

    public void setCaadhaar(String caadhaar) {
        this.caadhaar = caadhaar;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }
}
