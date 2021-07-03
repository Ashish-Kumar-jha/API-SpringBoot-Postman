package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Dao.RoomBookingDao;
import com.example.HotelSystem.HotelSystemAPI.Entity.RoomBookingEntity;
import com.example.HotelSystem.HotelSystemAPI.Response.JwtResponse;
import com.example.HotelSystem.HotelSystemAPI.Response.MessageResponse;
import com.example.HotelSystem.HotelSystemAPI.Request.LoginRequest;
import com.example.HotelSystem.HotelSystemAPI.Request.SignupRequest;
import com.example.HotelSystem.HotelSystemAPI.Service.CustomerDetailsService;
import com.example.HotelSystem.HotelSystemAPI.Service.RoomBook;
import com.example.HotelSystem.HotelSystemAPI.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomBookingController {
    @Autowired
    RoomBook room;
    //SHOW ALL USER
    @GetMapping("/booking/showCustomer")
    public List<RoomBookingEntity> showAllCustomer(){
        return this.room.showAllCustomer();
    }
    //GET SPECIFIC CUSTOMER
    @GetMapping("/booking/showCustomer/{customerId}")
    public RoomBookingEntity showCustomer(@PathVariable String customerId){
        return this.room.showCustomer(Integer.parseInt(customerId));
    }
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    RoomBookingDao roomBookingDao;

    //ADD CUSTOMER TO HOTEL LIST
    @PostMapping("/booking")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) {
        if (roomBookingDao.existsByCname(signUpRequest.getCname())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }

        if (roomBookingDao.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }

        // Create new user's account
        RoomBookingEntity roomBookingEntity = new RoomBookingEntity(signUpRequest.getCname(),
                signUpRequest.getCage(),signUpRequest.getCaadhaar(),signUpRequest.getContact(),signUpRequest.getCheckin(),signUpRequest.getCheckout(),signUpRequest.getEmail(),signUpRequest.getRoomtype(),
                encoder.encode(signUpRequest.getPassword()));


        roomBookingDao.save(roomBookingEntity);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtutil;

    @Autowired
    CustomerDetailsService customerDetailsService;
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody LoginRequest loginobj) throws Exception {
        try{
            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginobj.getCname(),loginobj.getPassword()));
        }catch(UsernameNotFoundException e){
            e.printStackTrace();
            throw  new Exception("BAD CREDENTIALS");
        }

        UserDetails userDetails=this.customerDetailsService.loadUserByUsername(loginobj.getCname());
        String token=this.jwtutil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }



}
