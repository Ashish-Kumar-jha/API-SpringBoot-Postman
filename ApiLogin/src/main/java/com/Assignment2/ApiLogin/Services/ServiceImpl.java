package com.Assignment2.ApiLogin.Services;

import com.Assignment2.ApiLogin.Dao.DataDao;
import com.Assignment2.ApiLogin.Dao.EventDao;
import com.Assignment2.ApiLogin.Entity.DataClass;
import com.Assignment2.ApiLogin.Entity.EventClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Service
public class ServiceImpl implements Servicees {

    @Autowired
    private DataDao datadao;
    @Autowired
    private EventDao eventdao;


    //GET all user data**
    @Override
    public List<DataClass> getUser() {
        return datadao.findAll();
    }

    //GET user for specific ID
    @Override
    public DataClass getUserById(int id) {
//        DataClass entity = datadao.getById(id);
          //return datadao.findAll(id);
        DataClass dc=null;
        for(DataClass d:datadao.findAll()){
            if(d.getId()==id){
                dc=d;;
                break;
            }
        }
        return dc;
    }

    //ADD OR POST **
    @Override
    public DataClass addUser(DataClass data) {
    datadao.save(data);
    return data;
    }

    //UPDATE or PUT**
    @Override
    public DataClass updateUser(DataClass data) {
    datadao.save(data);
    return data;
    }
    //DELETE**
    @Override
    public void deleteUser(int id) {
        DataClass entity = datadao.getById(id);
        datadao.delete(entity);

    }

    @Override
    public String loginValid(DataClass data) {
        String conf="";
        boolean auth=false;
        for(DataClass d:datadao.findAll()){
            if(d.getId()==data.getId() && d.getPassword().equals(data.getPassword())){
                conf+="Welcome "+d.getName()+" ";
                auth=true;
                break;
            }
        }
        if(auth)
            return conf;

        return "NOT A VALID USER";
    }

    @Override
    public EventClass addEvent(EventClass edata) {
        eventdao.save(edata);
        return edata;
    }

    @Override
    public List<EventClass> showEvent() {
        return eventdao.findAll();
    }


}
