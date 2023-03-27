package com.iammelvink.egg_timer;

public class add {
    private String address;
    int income;

    public add(String address, int income) {
        this.address = address;
        this.income = income;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
