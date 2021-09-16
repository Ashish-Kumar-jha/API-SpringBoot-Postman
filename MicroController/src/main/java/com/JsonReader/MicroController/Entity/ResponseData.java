package com.JsonReader.MicroController.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData {
    private String message;
    private LocalDateTime dateTime;
}
