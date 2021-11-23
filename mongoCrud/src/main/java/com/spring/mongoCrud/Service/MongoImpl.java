package com.spring.mongoCrud.Service;

import com.spring.mongoCrud.Dao.MongoDao;
import com.spring.mongoCrud.Document.CrudOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoImpl implements  MongoInter{

    @Autowired
    MongoDao mongoDao;
    @Override
    public CrudOperation savedata(CrudOperation crudOperation) {
        if(crudOperation!=null){
            return mongoDao.save(crudOperation);
        }
        return null;
    }

    @Override
    public List<CrudOperation> getdata() {
        return mongoDao.findAll();
    }

    @Override
    public List<CrudOperation> greaterage(int age) {
        return this.mongoDao.greaterage(age);

    }

    @Override
    public void deleterow(int id) {
        this.mongoDao.deleterow(id);
    }

    @Override
    public List<CrudOperation> startwith(char name) {
        return this.mongoDao.startswith(name);
    }

    @Override
    public int sumdata(int a, int b) {
        return a+b;
    }


}
