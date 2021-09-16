package com.JsonReader.MicroController.Service;

import com.JsonReader.MicroController.Entity.Data1;
import com.JsonReader.MicroController.Repository.Repo1;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JasperImple implements JasperInter{
    @Autowired
    Repo1 repo1;
    @Override
    public void getReport(String type, LocalDate fromdate,LocalDate todate) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\Para SF\\Desktop\\report";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String fromd = fromdate.format(formatter);
        String tod = todate.format(formatter);
        System.out.println(fromd);
        System.out.println(tod);
        String filename=fromd+" to "+tod+"-Tracking Data";
        List<Data1> staff = repo1.findBydateBetween(fromdate,todate);
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:Data1.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(staff);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "ASHISH KUMAR JHA");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (type.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\"+filename+".html");
        }
        if (type.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\"+filename+".pdf");
        }
        else{
            throw  new IllegalArgumentException();
        }
        //return "report generated in path : " + path;
    }
}
