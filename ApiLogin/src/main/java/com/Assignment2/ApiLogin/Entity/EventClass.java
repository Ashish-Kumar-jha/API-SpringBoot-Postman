package com.Assignment2.ApiLogin.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EventClass {
    @Id
    int eventId;
    String eventName;

    public EventClass() {

    }
    public EventClass(int eventId, String eventName) {
        super();
        this.eventId = eventId;
        this.eventName = eventName;
    }



    //Getters
    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    //Setters
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

}
