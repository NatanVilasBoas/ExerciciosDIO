package com.exercicios5.tributes;

public class Clothing implements ProductCategory {
    private final double tribute = 0.025;

    @Override
    public double calculateTribute(double price) {
        return price*tribute;
    }
}
