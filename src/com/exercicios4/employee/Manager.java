package com.exercicios4.employee;

public class Manager extends Employee implements ManagerActions, SalesmanActions {

    public Manager(String name, String email, String password) {
        super(name, email, password, true);
    };

    @Override
    public void checkSales() {

    }

    @Override
    public void generateFinancialReport() {

    }

}
