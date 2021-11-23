package com.pagination.page.Dao;

import com.pagination.page.Entity.PageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaginationDao extends JpaRepository<PageData, Integer> {
}
