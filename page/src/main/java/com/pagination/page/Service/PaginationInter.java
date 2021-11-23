package com.pagination.page.Service;

import com.pagination.page.Entity.PageData;

import java.util.List;

public interface PaginationInter {
   public PageData saveData(PageData pageData);

   public List<PageData> getAlldata();
}
