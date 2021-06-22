package com.example.HotelSystem.HotelSystemAPI.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StaffEntity {

    @Id
    String staffemail;
    String staffpassword;
    int staffage;

    public long getStaffpno() {
        return staffpno;
    }

    public void setStaffpno(long staffpno) {
        this.staffpno = staffpno;
    }

    long staffpno;
    String stafflocation;

    public StaffEntity() {
    }

    public StaffEntity(String staffemail, String staffpassword, int staffage, String stafflocation) {
        this.staffemail = staffemail;
        this.staffpassword = staffpassword;
        this.staffage = staffage;
        this.stafflocation = stafflocation;
    }

   /* public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }*/

    public String getStaffemail() {
        return staffemail;
    }

    public void setStaffemail(String staffemail) {
        this.staffemail = staffemail;
    }

    public String getStaffpassword() {
        return staffpassword;
    }

    public void setStaffpassword(String staffpassword) {
        this.staffpassword = staffpassword;
    }

    public int getStaffage() {
        return staffage;
    }

    public void setStaffage(int staffage) {
        this.staffage = staffage;
    }

    public String getStafflocation() {
        return stafflocation;
    }

    public void setStafflocation(String stafflocation) {
        this.stafflocation = stafflocation;
    }
}
