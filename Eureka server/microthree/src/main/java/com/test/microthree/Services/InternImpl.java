package com.test.microthree.Services;

import com.test.microthree.Model.Interns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InternImpl implements  InternInter{
@Autowired
Interns interns;
    @Override
    public Interns savedata() {
        interns.setName("ASHISH");
        interns.setAddress("NEW DELHI");
        interns.setCompany("ABC-COM");
        return interns;
    }

}
