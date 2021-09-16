package com.JsonReader.MicroController.Exceptions;

import com.JsonReader.MicroController.Entity.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {


    @ExceptionHandler(value=NullPointerException.class)
   ResponseEntity<ResponseData> handleExceptions(NullPointerException exception, WebRequest webRequest) {
        ResponseData response = new ResponseData();
        response.setDateTime(LocalDateTime.now());
        response.setMessage("Not found");
        ResponseEntity<ResponseData> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return entity;
    }
    @ExceptionHandler(value=IllegalArgumentException.class)
    ResponseEntity<ResponseData> handleException(IllegalArgumentException e, WebRequest webRequest){
        ResponseData response = new ResponseData();
        response.setDateTime(LocalDateTime.now());
        response.setMessage("File format is wrong");
        ResponseEntity<ResponseData> entity=new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        return entity;
    }
}