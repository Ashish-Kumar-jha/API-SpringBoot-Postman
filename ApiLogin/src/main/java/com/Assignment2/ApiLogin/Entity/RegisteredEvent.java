package com.Assignment2.ApiLogin.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class RegisteredEvent {
    @Id
private int evid;
private int Usid;
private String evName;

    public RegisteredEvent() {
    }

    public RegisteredEvent(int evid, int usid, String evName) {
        this.evid = evid;
        Usid = usid;
        this.evName = evName;
    }

    public int getEvid() {
        return evid;
    }

    public int getUsid() {
        return Usid;
    }

    public String getEvName() {
        return evName;
    }

    public void setEvid(int evid) {
        this.evid = evid;
    }

    public void setUsid(int usid) {
        Usid = usid;
    }

    public void setEvName(String evName) {
        this.evName = evName;
    }
}
