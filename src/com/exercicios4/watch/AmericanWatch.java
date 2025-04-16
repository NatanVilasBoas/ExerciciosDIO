package com.exercicios4.watch;

public class AmericanWatch extends Watch{

    public AmericanWatch(int hour, int minute, int seconds) {
        super(hour, minute, seconds);
    }

    @Override
    public void syncWith(Watch other) {
        int americanHour = other.getHour() > 12 ? other.getHour() - 12 : other.getHour();
        setHour(americanHour);
        setMinute(other.getMinute());
        setSeconds(other.getSeconds());
    }
}
