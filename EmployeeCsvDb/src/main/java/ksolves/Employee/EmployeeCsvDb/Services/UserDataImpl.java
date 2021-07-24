package ksolves.Employee.EmployeeCsvDb.Services;

import ksolves.Employee.EmployeeCsvDb.Dao.AddressDao;
import ksolves.Employee.EmployeeCsvDb.Dao.OfficeDao;
import ksolves.Employee.EmployeeCsvDb.Dao.PersonalDao;
import ksolves.Employee.EmployeeCsvDb.Models.AddressData;
import ksolves.Employee.EmployeeCsvDb.Models.OfficeData;
import ksolves.Employee.EmployeeCsvDb.Models.PersonalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


@Service
public class UserDataImpl  extends Thread implements UserData{
    @Autowired
    AddressDao addressDao;
    @Autowired
    OfficeDao officeDao;
    @Autowired
    PersonalDao personalDao;

    String row="";
    @Override
    public void SaveData() {


        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My task1 started..");
                try {
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("E:\\Hr1m.csv"));
                        row = br.readLine();
                        int count=0;
                        while ((row = br.readLine()) != null && count<=20000) {
                            String[] data = row.split(",");
                            AddressData ad = new AddressData(data[0], data[2], data[30], data[31], data[32], data[34], data[33]);
                            OfficeData od = new OfficeData(data[0], data[2], data[35], data[25], data[21]);
                            PersonalData pd = new PersonalData(data[0], data[2], data[6], data[10], data[8], data[7], data[28]);
                            officeDao.save(od);
                            addressDao.save(ad);
                            personalDao.save(pd);
                            count++;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("My task1 end..");
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My task2 started..");
                try {
                    TimeUnit.SECONDS.sleep(2);
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("E:\\Hr1m.csv"));
                        for(int i=0;i<20000;i++)
                        row = br.readLine();
                        int count=20001;
                        while ((row = br.readLine()) != null && count<=40000) {
                            String[] data = row.split(",");
                            AddressData ad = new AddressData(data[0], data[2], data[30], data[31], data[32], data[34], data[33]);
                            OfficeData od = new OfficeData(data[0], data[2], data[35], data[25], data[21]);
                            PersonalData pd = new PersonalData(data[0], data[2], data[6], data[10], data[8], data[7], data[28]);
                            officeDao.save(od);
                            addressDao.save(ad);
                            personalDao.save(pd);
                            count++;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("My task2 end..");
            }
        };

        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My task3 started..");
                try {
                    TimeUnit.SECONDS.sleep(2);
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("E:\\Hr1m.csv"));
                        for(int i=0;i<40000;i++)
                            row = br.readLine();
                        row = br.readLine();
                        int count=40001;
                        while ((row = br.readLine()) != null && count<=60000) {
                            String[] data = row.split(",");
                            AddressData ad = new AddressData(data[0], data[2], data[30], data[31], data[32], data[34], data[33]);
                            OfficeData od = new OfficeData(data[0], data[2], data[35], data[25], data[21]);
                            PersonalData pd = new PersonalData(data[0], data[2], data[6], data[10], data[8], data[7], data[28]);
                            officeDao.save(od);
                            addressDao.save(ad);
                            personalDao.save(pd);
                            count++;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("My task3 end..");
            }
        };


        ExecutorService executorService = Executors.newFixedThreadPool(2);


        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();
//            try {
//                BufferedReader br = new BufferedReader(new FileReader("E:\\Hr1m.csv"));
//                row = br.readLine();
//                int count=0;
//                while ((row = br.readLine()) != null && count<=200000) {
//                    String[] data = row.split(",");
//                    AddressData ad = new AddressData(data[0], data[2], data[30], data[31], data[32], data[34], data[33]);
//                    OfficeData od = new OfficeData(data[0], data[2], data[35], data[25], data[21]);
//                    PersonalData pd = new PersonalData(data[0], data[2], data[6], data[10], data[8], data[7], data[28]);
//                    officeDao.save(od);
//                    addressDao.save(ad);
//                    personalDao.save(pd);
//                    count++;
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

    }



}
