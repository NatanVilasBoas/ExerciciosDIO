package com.banco.contabancaria;

public class ContaBancaria {
    private String nomeConta;
    private double saldo;
    private final double chequeEspecial;
    private double chequeUsado;

    public ContaBancaria(String nome, double saldo){
        setNomeConta(nome);
        setSaldo(saldo);
        if(saldo <= 500){
            this.chequeEspecial = 50.00;
        } else {
            this.chequeEspecial = saldo*0.5;
        };
    };

    private double getChequeUsado(){
        return chequeUsado;
    }

    private void setChequeUsado(double chequeUsado) {
        this.chequeUsado = chequeUsado;
    }

    private String getNomeConta() {
        return nomeConta;
    }

    private void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double getChequeEspecial() {
        return chequeEspecial;
    }

    public double consultarSaldo(){
        return getSaldo();
    }

    public double consultaChequeEspecial(){
        return getChequeEspecial();
    }

    public void sacar(double valor){
        if(valor < this.saldo){
            this.saldo -= valor;
        } else if(valor > saldo && (valor - this.saldo) <= this.chequeEspecial){
            double rest = valor - this.saldo;
            this.saldo = 0;
            setChequeUsado(rest);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor){
        if(chequeUsado > 0) {
            this.saldo += (valor - chequeUsado * 0.2);
            setChequeUsado(0);
        }
        else this.saldo += valor;
    }

    public void pagarBoleto(double valor){
        if(valor < this.saldo){
            this.saldo -= valor;
        } else if(valor > saldo && (valor - this.saldo) <= this.chequeEspecial){
            double rest = valor - this.saldo;
            this.saldo = 0;
            setChequeUsado(rest);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void verificarChequeEspecial(){
        boolean chequeUsado = getChequeUsado() > 0;
        if(chequeUsado)
            System.out.println("Está sendo utilizado o cheque especial: " + getChequeUsado());
        else
            System.out.println("Não está sendo utilizado cheque especial");
    }
}
