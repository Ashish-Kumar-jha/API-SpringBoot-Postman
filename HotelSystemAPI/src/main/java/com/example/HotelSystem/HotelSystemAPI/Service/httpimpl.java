package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Dao.httpcheckdao;
import com.example.HotelSystem.HotelSystemAPI.Entity.httpcheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class httpimpl implements http{
    @Autowired
    httpcheckdao htt;

    @Override
    public httpcheck checkhttp(int parseInt) {
        httpcheck h=null;
        for(httpcheck ht:htt.findAll()){
            if(ht.getId()==parseInt)
            {
                h=ht;
                break;
            }
        }
        return h;
    }

    @Override
    public httpcheck savecheckhttp(httpcheck http) {
       return htt.save(http);
    }
}
