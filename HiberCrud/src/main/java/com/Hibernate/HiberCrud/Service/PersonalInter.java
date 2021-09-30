package com.Hibernate.HiberCrud.Service;

import com.Hibernate.HiberCrud.Entity.PersonalDetails;

import java.util.List;

public interface PersonalInter {
    public String savedata(PersonalDetails personalDetails);

    public List<PersonalDetails> getdata();
}
