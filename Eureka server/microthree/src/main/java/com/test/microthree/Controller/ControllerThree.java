package com.test.microthree.Controller;

import com.test.microthree.Model.Interns;
import com.test.microthree.Services.InternInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("three/api")
public class ControllerThree {
    @Autowired
    InternInter internInter;


    @GetMapping("/save")
    public ResponseEntity<?> getTestMessage() {
        Interns intern =this.internInter.savedata();
        return new ResponseEntity<>(intern, HttpStatus.OK);	}

}
