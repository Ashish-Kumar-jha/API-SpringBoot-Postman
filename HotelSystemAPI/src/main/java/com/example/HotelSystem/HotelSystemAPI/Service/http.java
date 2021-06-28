package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Entity.httpcheck;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface http {
    public httpcheck checkhttp(int parseInt);

    public httpcheck savecheckhttp(httpcheck http);


}
