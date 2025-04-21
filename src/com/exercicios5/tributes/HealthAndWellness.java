package com.exercicios5.tributes;

public class HealthAndWellness implements ProductCategory {
    private final double tribute = 0.015;

    @Override
    public double calculateTribute(double price) {
        return price*tribute;
    }
}
