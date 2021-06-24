package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Entity.InvoiceCheckoutEntity;

import java.util.List;

public interface InvoiceCheckout {
    public List<InvoiceCheckoutEntity> showAllInvoice();
    public InvoiceCheckoutEntity showInvoice(int parseInt);
    public InvoiceCheckoutEntity generateInvoice(int id);
}
