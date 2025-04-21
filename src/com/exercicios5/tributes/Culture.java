package com.exercicios5.tributes;

public class Culture implements ProductCategory {
    private final double tribute = 0.04;

    @Override
    public double calculateTribute(double price) {
        return price*tribute;
    }
}
