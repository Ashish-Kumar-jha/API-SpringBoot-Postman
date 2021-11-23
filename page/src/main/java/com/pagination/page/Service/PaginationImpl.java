package com.pagination.page.Service;

import com.pagination.page.Dao.PaginationDao;
import com.pagination.page.Entity.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaginationImpl implements PaginationInter{

    @Autowired
    PaginationDao paginationDao;
    @Override
    public PageData saveData(PageData pageData) {
        return paginationDao.save(pageData);
    }

    @Override
    public List<PageData> getAlldata() {
        return paginationDao.findAll();
    }

}
