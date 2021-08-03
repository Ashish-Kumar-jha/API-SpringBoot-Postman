package com.Mapping.OneToOne.Service;

import com.Mapping.OneToOne.Dao.Table1Dao;
import com.Mapping.OneToOne.Entity.Table1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableImpl implements TableInter {
    @Autowired
    Table1Dao table1Dao;

    @Override
    public Table1 addData(Table1 tabobj) {
        return table1Dao.save(tabobj);
    }
}
