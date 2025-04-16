package com.exercicios4.watch;

public class BrazillianWatch extends Watch{

    public BrazillianWatch(int hour, int minute, int seconds) {
        super(hour, minute, seconds);
    }

    @Override
    public void syncWith(Watch other) {
        setHour(other.getHour());
        setMinute(other.getMinute());
        setSeconds(other.getSeconds());
    }
}
