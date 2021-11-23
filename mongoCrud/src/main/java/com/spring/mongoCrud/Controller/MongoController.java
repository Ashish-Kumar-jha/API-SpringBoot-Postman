package com.spring.mongoCrud.Controller;

import com.spring.mongoCrud.Document.CrudOperation;
import com.spring.mongoCrud.Service.MongoInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MongoController {
    @Autowired
    MongoInter mongoInter;

    @GetMapping("/sumdata/{a}/{b}")
    public int sumtwo(@PathVariable int a, @PathVariable int b){
        return this.mongoInter.sumdata(a,b);
    }
    @PostMapping("/save")
    public CrudOperation savedata(@RequestBody CrudOperation crudOperation){
        return this.mongoInter.savedata(crudOperation);
    }
    @GetMapping("/get")
    public List<CrudOperation> getdata(){
        return this.mongoInter.getdata();
    }

    @GetMapping("/greaterage/{age}")
    public List<CrudOperation> greaterage(@PathVariable int age){
        return this.mongoInter.greaterage(age);
    }
    @GetMapping("/namestartswith/{name}")
    public List<CrudOperation> Startwith(@PathVariable char name){
        return this.mongoInter.startwith(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleterow(@PathVariable int id){
        this.mongoInter.deleterow(id);
    }
}
























