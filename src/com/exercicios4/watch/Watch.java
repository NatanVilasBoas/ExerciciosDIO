package com.exercicios4.watch;

public abstract class Watch {
    private int hour;
    private int minute;
    private int seconds;

    protected Watch(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    };

    protected int getHour() {
        return hour;
    }

    protected void setHour(int hour) {
        if(this.hour + hour > 24) return;
        this.hour = hour;
    }

    protected int getMinute() {
        return minute;
    }

    protected void setMinute(int minute) {
        if(this.minute + minute > 60) return;;
        this.minute = minute;
    }

    protected int getSeconds() {
        return seconds;
    }

    protected void setSeconds(int seconds) {
        if(this.seconds + seconds > 60) return;
        this.seconds = seconds;
    }

    public String getTime(){
        return String.format("%d:%d:%d", getHour(), getMinute(), getSeconds());
    }

    protected abstract void syncWith(Watch other);
}
