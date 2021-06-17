package com.Assignment2.ApiLogin.Services;

import com.Assignment2.ApiLogin.Entity.DataClass;
import com.Assignment2.ApiLogin.Entity.EventClass;

import java.util.List;

public interface Servicees {
    public List<DataClass> getUser();
    public DataClass getUserById(int id);
    public DataClass addUser(DataClass data);
    public DataClass updateUser(DataClass data);
    public void deleteUser(int id);

    //login auth
    public String  loginValid(DataClass data);
    public EventClass addEvent(EventClass edata);
    public List<EventClass> showEvent();
}
