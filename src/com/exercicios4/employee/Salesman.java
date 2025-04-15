package com.exercicios4.employee;

public class Salesman  extends Employee implements SalesmanActions {
    private int sales;

    public Salesman(String name, String email, String password) {
        super(name, email, password, false);
    }

    @Override
    public void checkSales() {
        System.out.println(sales);
    }

    public int getSales() {
        return sales;
    }

    public void sell() {
        this.sales += 1;
    }
};
