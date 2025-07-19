package org.hibpro;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer com;

    private int salary;

//    private Laptop lap;
//    @ConstructorProperties({"age","lap","salary"})
    public Alien(int age,Computer com,int salary) {
        System.out.println("Parameterized constructor called");
        this.age=age;
//        this.lap=lap;
        this.com=com;
    }
    public Alien(){
        System.out.println("Alien");
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
//
//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void code(){
        System.out.println("code");
        com.compile();
    }
}
