package com.example.crud.CrudH2Database.Service;

import com.example.crud.CrudH2Database.Entity.StudentDescription;
import com.example.crud.CrudH2Database.Repository.StudentDescriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentDescriptionService {

    @Autowired
    StudentDescriptionRepo studentDescriptionRepo;

    public List<StudentDescription> findAlldata() {
        return studentDescriptionRepo.findAll();
    }

    public String saveData(StudentDescription studentDescription) {
        if (studentDescription != null) {
            studentDescriptionRepo.save(studentDescription);
            return "Data Persisted";
        }
        return "Error occurred while persisting data";
    }

    public String updateName(Integer id, String name) {
        List<StudentDescription> res = studentDescriptionRepo.findAll();
        StudentDescription store = null;
        if (res == null) {
            return "No Data Available To Update";
        }
        for(StudentDescription x:res) {
            if (x.getId() == id) {
                x.setName(name);
                store = x;
                studentDescriptionRepo.save(store);
            }
        }
        return "Data Updated";
    }

    public String deletedata(Integer id) {
        if (studentDescriptionRepo.findById(id).get() != null) {
            studentDescriptionRepo.deleteById(id);
            return "Data Deleted";
        }
        return "Error occured while deleting data";
    }
}
