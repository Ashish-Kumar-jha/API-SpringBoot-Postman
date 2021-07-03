package com.example.HotelSystem.HotelSystemAPI.Service;

import com.example.HotelSystem.HotelSystemAPI.Dao.FoodOrderTableDao;
import com.example.HotelSystem.HotelSystemAPI.Dao.InvoiceCheckoutDao;
import com.example.HotelSystem.HotelSystemAPI.Dao.RoomBookingDao;
import com.example.HotelSystem.HotelSystemAPI.Dao.RoomTypeDao;
import com.example.HotelSystem.HotelSystemAPI.Entity.FoodOrderTableEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.InvoiceCheckoutEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.RoomBookingEntity;
import com.example.HotelSystem.HotelSystemAPI.Entity.RoomTypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class InvoiceCheckoutImpl implements  InvoiceCheckout {

    @Autowired
    InvoiceCheckoutDao invdao;
    @Autowired
    RoomBookingDao roomdao;
    @Autowired
    RoomTypeDao rtdao;
    @Autowired
    FoodOrderTableDao fooddao;

    //SHOW ALL INVOICE
    @Override
    public List<InvoiceCheckoutEntity> showAllInvoice() {
        return invdao.findAll();
    }

    @Override
    public InvoiceCheckoutEntity showInvoice(int parseInt) {
        InvoiceCheckoutEntity ie = null;
        for (InvoiceCheckoutEntity ee : invdao.findAll()) {
            if (ee.getBid() == parseInt) {
                ie = ee;
                break;
            }
        }
        return ie;
    }

    @Override
    public InvoiceCheckoutEntity generateInvoice(int id) {

        int bid = id;
        boolean check=false;
        String roomtype ="";
        int roomprice=0;
        int foodprice=0;
        long noofdays=0;

        for (RoomBookingEntity re : roomdao.findAll()) {
            if (re.getBid() == bid) {
                roomtype = re.getRoomtype();
                check=true;
                break;
            }
            else{
                check=false;
            }
        }
        for (RoomTypeEntity re : rtdao.findAll()) {
            if (re.getRoomtype().equalsIgnoreCase(roomtype)) {
                roomtype = re.getRoomtype();
                roomprice = re.getRoomtypeprice();
                break;
            }
        }
        for (FoodOrderTableEntity fe : fooddao.findAll()) {
            if (fe.getBid() == bid) {
                foodprice += fe.getPrice();
            }
        }

        for (RoomBookingEntity re : roomdao.findAll()) {
            if (re.getBid() == bid) {
                noofdays = ChronoUnit.DAYS.between(re.getCheckin(), re.getCheckout());
                break;
            }

        }
   if(check==false){
       InvoiceCheckoutEntity obj=null;
       return obj;
   }

        int total = (int) (noofdays * roomprice) + foodprice;
        InvoiceCheckoutEntity obj = new InvoiceCheckoutEntity(bid, roomtype, roomprice, foodprice, noofdays, total);
        return invdao.save(obj);
    }
}