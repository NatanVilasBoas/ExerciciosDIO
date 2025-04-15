package com.exercicios4.ticket;

public abstract class Ticket {
    protected double price;
    private String filmName;
    private boolean isSubtitled;

    public Ticket(double price, String filmName, Boolean isSubtitled){
        this.price = price;
        this.filmName = filmName;
        this.isSubtitled = isSubtitled;
    }

    public abstract double getPrice();

    public void setPrice(double price){
        this.price = price;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public boolean isSubtitled() {
        return isSubtitled;
    }

    public void setIsSubtitled(boolean subtitled) {
        isSubtitled = subtitled;
    }
}
