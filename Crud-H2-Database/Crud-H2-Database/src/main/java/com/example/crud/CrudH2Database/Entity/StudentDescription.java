package com.example.crud.CrudH2Database.Entity;

import lombok.*;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private String phoneNumber;
    private String description;


}
