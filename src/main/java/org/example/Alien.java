package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    public Alien() {
        System.out.println("Alien object created!!");
    }


    @Value("21")
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

    @Autowired
    @Qualifier("laptop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
