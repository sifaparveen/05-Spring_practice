package org.example;

public class Alien {

    private int age;
    private Computer comp;

//    public Alien(int age, Computer comp) {
//        this.age = age;
//        this.comp = comp;
//    }

    public void message() {
        System.out.println(age);
        comp.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
