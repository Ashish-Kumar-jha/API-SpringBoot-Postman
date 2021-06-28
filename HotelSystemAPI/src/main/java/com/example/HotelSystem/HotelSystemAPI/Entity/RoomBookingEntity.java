package com.example.HotelSystem.HotelSystemAPI.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Validated
@Entity
public class RoomBookingEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int bid;
@Column(nullable = false)
String cname;
@Column(nullable = false)
int cage;
@Column(nullable = false)
String caadhaar;
@Column(nullable = false)
String email;
@Column(nullable = false)
long contact;
String roomtype;


@JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="dd-MM-yyyy")
private LocalDate checkin;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="dd-MM-yyyy")
private LocalDate checkout;
    public RoomBookingEntity(){

    }
    public RoomBookingEntity(String cname, int cage, String caadhaar, long contact, LocalDate checkin, LocalDate checkout,String email,String roomtype) {
        this.cname = cname;
        this.cage = cage;
        this.caadhaar = caadhaar;
        this.contact = contact;
        this.checkin = checkin;
        this.checkout = checkout;
        this.email=email;
        this.roomtype=roomtype;
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
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
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
