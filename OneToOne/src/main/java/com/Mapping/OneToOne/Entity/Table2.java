package com.Mapping.OneToOne.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table2 {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int  id;
    private String stream;
    private String college;

}
