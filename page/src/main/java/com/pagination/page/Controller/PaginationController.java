package com.pagination.page.Controller;

import com.pagination.page.Dao.PaginationDao;
import com.pagination.page.Entity.PageData;
import com.pagination.page.Service.PaginationInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaginationController
{
    @Autowired
    PaginationInter paginationInter;
    @Autowired
    PaginationDao paginationDao;

    @PostMapping("/")
    public PageData saveData(@RequestBody PageData pageData){
        return this.paginationInter.saveData(pageData);
    }

    @GetMapping("/")
    public List<PageData> getAlldata(){
        return this.paginationInter.getAlldata();
    }
    @GetMapping("/{offset}/{pageSize}/{field}")
    Page<PageData> Paginationdata(@PathVariable int offset, @PathVariable int pageSize,@PathVariable String field){
        Page<PageData> all = paginationDao.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
        System.out.println(all.getContent().get(0).getName());

        return all;
    }

}
