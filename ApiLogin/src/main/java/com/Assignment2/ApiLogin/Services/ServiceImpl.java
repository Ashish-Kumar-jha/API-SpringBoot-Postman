package com.Assignment2.ApiLogin.Services;

import com.Assignment2.ApiLogin.Dao.DataDao;
import com.Assignment2.ApiLogin.Dao.EventDao;
import com.Assignment2.ApiLogin.Dao.RegisteresEventDao;
import com.Assignment2.ApiLogin.Entity.DataClass;
import com.Assignment2.ApiLogin.Entity.EventClass;
import com.Assignment2.ApiLogin.Entity.RegisteredEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceImpl implements Servicees {
    @Autowired
    private RegisteresEventDao registeredeventdao;
    @Autowired
    private DataDao datadao;
    @Autowired
    private EventDao eventdao;

/* USER DATA REGISTRATION SECTION*/
    //GET all user data**
    @Override
    public List<DataClass> getUser() {
        return datadao.findAll();
    }

    //GET user for specific ID
    @Override
    public DataClass getUserById(int id) {
        DataClass dc=null;
        for(DataClass d:datadao.findAll()){
            if(d.getId()==id){
                dc=d;
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


    /*LOGIN DATA AUTH*/
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


    List<String>list=new ArrayList<String>();
/*EVENT REGISTRATION*/
    @Override
    public String registerEvent(int uid,int evid) {
        DataClass dc=null;
        boolean user,event;
        event=user=false;
        for(DataClass d:datadao.findAll()){
            if(d.getId()==uid)
            {
                dc=d;
                user=true;
                break;
            }
        }
        EventClass ec=null;
        for(EventClass e:eventdao.findAll()){
            if(e.getEventId()==evid)
            {
                ec=e;
                event=true;
                break;
            }
        }

        String name="";
        if(user==true && event==true)
        {
           for(EventClass ee: eventdao.findAll()){
               if(ee.getEventId()==evid){
                   name=(ee.getEventName());
               }
           }
           String prev="";
           for(RegisteredEvent fetch:registeredeventdao.findAll()){
               if(fetch.getUsid()==uid){
                   prev=fetch.getEvName();
               }
           }
          // name=name.concat(" | ").concat(prev);
            RegisteredEvent rr=new RegisteredEvent(uid,name);
            registeredeventdao.save(rr);
            return "REGISTERED SUCCESSFULLY FOR "+ " "+name;
        }
        return "CHECK EVENT ID/ USER ID";
    }


    //SHOW EVENTS FOR SPECIFIC USER ID
    @Override
    public List<RegisteredEvent> ShowEventForId(int uid) {
        List<RegisteredEvent> r=new ArrayList<RegisteredEvent>();
        for(RegisteredEvent rr: registeredeventdao.findAll()){
            if(rr.getUsid()==uid){
                r.add(rr);
            }
        }
        return r;
    }


}
