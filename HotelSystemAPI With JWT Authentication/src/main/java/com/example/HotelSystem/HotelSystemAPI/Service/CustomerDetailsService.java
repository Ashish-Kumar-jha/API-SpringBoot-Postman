package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Dao.RoomBookingDao;
import com.example.HotelSystem.HotelSystemAPI.Entity.RoomBookingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsService implements UserDetailsService {
    @Autowired
    RoomBookingDao roomBookingDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        RoomBookingEntity roomBookingEntity = roomBookingDao.findByCname(username);
        if(roomBookingEntity==null)
        throw new UsernameNotFoundException("User Not Found with username: " + username);

        return UserImplJwt.build(roomBookingEntity);
    }
}
