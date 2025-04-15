package com.exercicios4.ticket;

public class FamilyTicket extends Ticket{
    private int member;

    public FamilyTicket(double price, String filmName, Boolean isSubtitled, int member) {
        super(price, filmName, isSubtitled);
        this.member += member;
    }

    @Override
    public double getPrice(){
        if(member > 3) return ((price * member)*0.95);
        else return price * member;
    }
}
