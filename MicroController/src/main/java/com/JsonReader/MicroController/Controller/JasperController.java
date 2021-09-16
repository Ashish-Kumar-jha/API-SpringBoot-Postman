package com.JsonReader.MicroController.Controller;

import com.JsonReader.MicroController.Service.JasperInter;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.time.LocalDate;

@RestController
@RequestMapping("/Android")
public class JasperController {
    @Autowired
    JasperInter jasperInter;
    /*To get jasper report in html and pdf format for specific dates*/
    @GetMapping("/report/{type}/{fromdate}/{todate}")
    public void getReport(@PathVariable String type, @PathVariable String fromdate, @PathVariable String todate) throws JRException, FileNotFoundException {
        this.jasperInter.getReport(type, LocalDate.parse(fromdate),LocalDate.parse(todate));
    }
}
