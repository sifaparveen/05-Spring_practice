package org.example;

public class Alien {

    private int age;
    private Laptop lap;

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public void message() {
        System.out.println(age);
        lap.code();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;

    }
}
