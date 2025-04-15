package com.exercicios4.employee;

public class Attendant extends Employee implements  AttendantActions {

    public Attendant(String name, String email, String password) {
        super(name, email, password, false);
    }

    @Override
    public void receivePayment() {

    }

    @Override
    public void closeCashRegister() {

    }
}
