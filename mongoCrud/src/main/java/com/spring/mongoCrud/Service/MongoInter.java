package com.spring.mongoCrud.Service;


import com.spring.mongoCrud.Document.CrudOperation;

import java.util.List;

public interface MongoInter {
    public CrudOperation savedata(CrudOperation crudOperation);

    public List<CrudOperation> getdata();
    public List<CrudOperation> greaterage(int age);
    public void deleterow(int id);
    public List<CrudOperation> startwith(char name);
    public int sumdata(int a, int b);
}
