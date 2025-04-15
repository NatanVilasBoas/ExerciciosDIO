package com.exercicios3.carro;

public class Car {
    private boolean isOn;
    private double velocity;
    private int gears;

    public Car() {
        this.isOn = false;
        this.gears = 0;
        this.velocity = 0;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        if(!isOn){
            if(this.velocity == 0 && this.gears == 0){
                this.isOn = false;
                System.out.println("Carro desligado");
            } else {
                System.out.println("Para desligar o carro ele deve estar em ponto morto e parado.");
            }
            return;
        }
        this.isOn = isOn;
        System.out.println("Carro ligado");
    }

    public double getVelocity() {
        return velocity;
    }

    private void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        if(!isOn) {
            System.out.println("O carro deve ser ligado primeiro");
            return;
        }
        if((gears - this.gears == 1 || this.gears - gears == 1)){
            this.gears = gears;
        } else System.out.println("Só é permitida a troca de uma marcha por vez!");
    }

    public void accelerate(){
        if(!isOn) {
            System.out.println("O carro deve ser ligado primeiro");
            return;
        }
        if(this.velocity < 120 ){
           if(checkGear(this.velocity + 1)) setVelocity(this.velocity + 1);
           else System.out.println("Necessário aumentar a marcha para aumentar velocidade.");
        } else System.out.println("O carro está na velocidade máxima.");
    }

    public void decelerate(){
        if(!isOn) {
            System.out.println("O carro deve ser ligado primeiro");
            return;
        }
        if(velocity > 0){
            if(checkGear(this.velocity - 1)) setVelocity(this.velocity - 1);
            else System.out.println("Necessário diminuir a marcha para reduzir velocidade.");
        } else System.out.println("O carro já está parado.");
    }

    public boolean checkGear(double velocity){
        if (velocity == 0) return this.gears == 0;
        if (velocity <= 20) return this.gears == 1;
        if (velocity <= 40) return this.gears == 2;
        if (velocity <= 60) return this.gears == 3;
        if (velocity <= 80) return this.gears == 4;
        if (velocity <= 100) return this.gears == 5;
        return this.gears == 6;
    }

    public void turnRightLeft(String side){
        if(!isOn) {
            System.out.println("Carro deve estar ligado.");
            return;
        }
        if(this.velocity == 0) {
            System.out.println("Carro deve estar em movimento.");
            return;
        }
        if(this.velocity <= 40){
            System.out.println("Carro virou para " + side);
        } else {
            System.out.println("É necessário diminuir a velocidade para virar para " + side);
        }
    }
}
