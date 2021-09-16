package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Service.JasperService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class JASPER_CONTROLLER {
@Autowired
JasperService jasperService;

    @GetMapping("/GetData/{format}")
    public String getreport(@PathVariable String format) throws JRException, FileNotFoundException {
        return jasperService.exportReport(format);
    }
}
