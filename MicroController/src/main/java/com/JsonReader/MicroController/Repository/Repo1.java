package com.JsonReader.MicroController.Repository;
import com.JsonReader.MicroController.Entity.Data1;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface Repo1 extends JpaRepository<Data1, Integer> {
    List<Data1> findBydateBetween(LocalDate fromdate, LocalDate todate);
    List<Data1> findBytimeBetween(LocalTime fromtime, LocalTime totime);
}
