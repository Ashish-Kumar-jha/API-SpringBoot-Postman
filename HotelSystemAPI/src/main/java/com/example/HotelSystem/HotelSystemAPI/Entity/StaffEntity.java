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
    long staffpno;
    String stafflocation;



    public StaffEntity(String staffemail, String staffpassword, int staffage, long staffpno, String stafflocation) {
        this.staffemail = staffemail;
        this.staffpassword = staffpassword;
        this.staffage = staffage;
        this.staffpno = staffpno;
        this.stafflocation = stafflocation;
    }
    public StaffEntity() {
    }



    public long getStaffpno() {
        return staffpno;
    }
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
    public void setStaffpno(long staffpno)
    {
        this.staffpno = staffpno;
    }
}
