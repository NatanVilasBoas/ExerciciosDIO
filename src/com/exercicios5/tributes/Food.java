package com.exercicios5.tributes;

public class Food implements ProductCategory {
    private final double tribute = 0.01;

    @Override
    public double calculateTribute(double price) {
        return price*tribute;
    }
}
