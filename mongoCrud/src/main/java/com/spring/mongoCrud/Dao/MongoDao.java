package com.spring.mongoCrud.Dao;

import com.spring.mongoCrud.Document.CrudOperation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
public interface MongoDao extends MongoRepository<CrudOperation,Integer> {

//GREATER THAN EQUALS TO VALUE
    @Query("{age:{$gte:?0}}")
    public List<CrudOperation> greaterage(int age);

//DELETE
    @Query(value = "{id:?0}", delete = true)
   public void deleterow(int id);

//STARTS WITH ANY CHAR
    @Query("{name:/^?0/}")
   public List<CrudOperation> startswith(char name);
}
