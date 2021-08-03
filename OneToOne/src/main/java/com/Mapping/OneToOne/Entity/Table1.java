package com.Mapping.OneToOne.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table1 {

    @Id
    private int id;
    private String  name;
    private String address;

    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name="Tab_2", referencedColumnName = "id")
    private Table2 table2;


}
