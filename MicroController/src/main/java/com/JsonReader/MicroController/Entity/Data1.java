package com.JsonReader.MicroController.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Data1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float longitude;
    private float latitude;
    private LocalTime time;
    private LocalDate date;
    public Data1(float longitude, float latitude, LocalTime time, LocalDate date){
        this.latitude=latitude;
        this.longitude=longitude;
        this.time=time;
        this.date=date;
    }
}


