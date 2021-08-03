package com.Mapping.OneToOne.Controller;

import com.Mapping.OneToOne.Entity.Table1;
import com.Mapping.OneToOne.Entity.Table2;
import com.Mapping.OneToOne.Service.TableImpl;
import com.Mapping.OneToOne.Service.TableInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {

    @Autowired
    TableInter tableInter;
@PostMapping("/AddData")
    public Table1 AddData(@RequestBody Table1 tabobj) {
    return tableInter.addData(tabobj);
}
}
