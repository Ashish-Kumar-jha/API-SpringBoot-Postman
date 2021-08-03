package com.Mapping.OneToOne.Controller;

import com.Mapping.OneToOne.Dao.Table1Dao;
import com.Mapping.OneToOne.Entity.Table1;
import com.Mapping.OneToOne.Entity.Table2;
import com.Mapping.OneToOne.Service.TableImpl;
import com.Mapping.OneToOne.Service.TableInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TableController {

    @Autowired
    TableInter tableInter;
@PostMapping("/AddData")
    public Table1 AddData(@RequestBody Table1 tabobj) {
    return tableInter.addData(tabobj);
}

@Autowired
    Table1Dao table1Dao;
@DeleteMapping("/delete/{id}")
    public String deletedata(@PathVariable int id){
    Table1 t=null;
    for(Table1 t1: table1Dao.findAll()){
        if(t1.getId()==id){
            t=t1;
            break;
        }
    }
    table1Dao.delete(t);
    return "deleted";

}
}
