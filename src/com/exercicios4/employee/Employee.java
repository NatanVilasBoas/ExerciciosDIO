package com.exercicios4.employee;

public abstract class Employee {
    protected String name;
    protected String email;
    protected String password;
    protected boolean admin;
    protected boolean isLogged;

    public Employee(String name, String email, String password, boolean admin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public void changeData(String name, String email){
        setName(name);
        setEmail(email);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(){
        isLogged = true;
    }

    public void logoff(){
        isLogged = false;
    }
}
