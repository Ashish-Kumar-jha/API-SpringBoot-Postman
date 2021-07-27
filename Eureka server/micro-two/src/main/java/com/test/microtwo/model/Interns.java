package com.test.microtwo.model;

import java.io.Serializable;

public class Interns  implements Serializable {

    private static final long serialVersionUID = 3711627601069676274L;
    String name;
    String address;
    String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
