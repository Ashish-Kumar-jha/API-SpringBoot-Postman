package com.Mapping.OneToOne.Dao;

import com.Mapping.OneToOne.Entity.Table1;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Table1Dao extends JpaRepository<Table1,Integer> {
}
