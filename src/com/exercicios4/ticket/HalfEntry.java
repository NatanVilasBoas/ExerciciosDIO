package com.exercicios4.ticket;

public class HalfEntry extends Ticket {

    public HalfEntry(double price, String filmName, Boolean isSubtitled) {
        super(price, filmName, isSubtitled);
    }

    @Override
    public double getPrice() {
        return price/2;
    }
}
