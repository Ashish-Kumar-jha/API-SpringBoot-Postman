package com.Hibernate.HiberCrud.Service;

import com.Hibernate.HiberCrud.Entity.PersonalDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalImpl implements PersonalInter{
    @Override
    public String savedata(PersonalDetails personalDetails) {
        return null;
    }

    @Override
    public List<PersonalDetails> getdata() {
        return null;
    }
}
