package com.Hibernate.HiberCrud.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDetails {
    private int id;
    private String name;
    private String degree;
    private String address;
    private long pno;
}
