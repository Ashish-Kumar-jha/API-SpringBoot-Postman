package com.example.authentaction.controller;
import com.example.authentaction.Service.CustomerDetailsService;
import com.example.authentaction.jwt.JwtUtils;
import com.example.authentaction.models.User;
import com.example.authentaction.repository.UserRepository;
import com.example.authentaction.request.LoginRequest;
import com.example.authentaction.request.SignupRequest;
import com.example.authentaction.response.JwtResponse;
import com.example.authentaction.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }

        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }

        // Create new user's account
        User user = new User(signUpRequest.getUsername(),
                signUpRequest.getEmail(),
                encoder.encode(signUpRequest.getPassword()));


        userRepository.save(user);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }

    @Autowired
    private CustomerDetailsService customerDetailsService;

    @Autowired
    private JwtUtils jwtutil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/Welcome")
    public String welcome(){
        return "ASHISH KUMAR AUTHINTICATED";
    }
@PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody LoginRequest loginobj) throws Exception {
    try{
        this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginobj.getUsername(),loginobj.getPassword()));
    }catch(UsernameNotFoundException e){
        e.printStackTrace();
        throw  new Exception("BAD CREDENTIALS");
    }

    UserDetails userDetails=this.customerDetailsService.loadUserByUsername(loginobj.getUsername());
    String token=this.jwtutil.generateToken(userDetails);
    return ResponseEntity.ok(new JwtResponse(token));
    }



}
