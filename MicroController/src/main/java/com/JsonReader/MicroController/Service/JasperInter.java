package com.JsonReader.MicroController.Service;

import net.sf.jasperreports.engine.JRException;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public interface JasperInter {
   public void getReport(String type, LocalDate fromdate, LocalDate todate) throws FileNotFoundException, JRException;
}
