package com.example.crud.CrudH2Database.Controller;

import com.example.crud.CrudH2Database.Entity.StudentDescription;
import com.example.crud.CrudH2Database.Service.StudentDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDescriptionController {
@Autowired
    StudentDescriptionService studentDescriptionService;

@GetMapping("/findAllData")
    public List<StudentDescription> findAlldata(){
        return  studentDescriptionService.findAlldata();
}

@PostMapping("/saveData")
    public String savedata(@RequestBody StudentDescription studentDescription){
        return studentDescriptionService.saveData(studentDescription);
}

@PutMapping("/updateName/{id}/{name}")
    public String updateName(@PathVariable Integer id, @PathVariable String name){
        return studentDescriptionService.updateName(id,name);
}

@DeleteMapping("/deleteData/{id}")
     public  String deleteData(@PathVariable Integer id){
        return studentDescriptionService.deletedata(id);
}
}
