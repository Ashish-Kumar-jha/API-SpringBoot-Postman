package com.example.HotelSystem.HotelSystemAPI.Controller;

import com.example.HotelSystem.HotelSystemAPI.Entity.InvoiceCheckoutEntity;
import com.example.HotelSystem.HotelSystemAPI.Service.InvoiceCheckout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceCheckoutController {
    @Autowired
    InvoiceCheckout invoice;

    //SHOW ALL INVOICE
    @GetMapping("/checkoutInvoice")
    public List<InvoiceCheckoutEntity> showALlInvoice(){
        return invoice.showAllInvoice();
    }

//    //SHOW SPECIFIC INVOICE
//    @GetMapping("/checkoutInvoice/{id}")
//    public InvoiceCheckoutEntity showInvoice(@PathVariable String id){
//        return this.invoice.showInvoice(Integer.parseInt(id));
//    }

    //INVOICE GENERATOR
    @PostMapping("/checkoutInvoice/{id}")
    public InvoiceCheckoutEntity generateInvoice(@PathVariable String id){
        return this.invoice.generateInvoice(Integer.parseInt(id));

    }
}
