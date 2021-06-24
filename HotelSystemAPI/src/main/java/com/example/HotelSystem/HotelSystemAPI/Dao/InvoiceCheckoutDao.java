package com.example.HotelSystem.HotelSystemAPI.Dao;

import com.example.HotelSystem.HotelSystemAPI.Entity.InvoiceCheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceCheckoutDao extends JpaRepository<InvoiceCheckoutEntity,Integer> {
}
