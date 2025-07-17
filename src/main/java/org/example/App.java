package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

            Alien obj = context.getBean("alien", Alien.class);
            Computer comp = context.getBean(Laptop.class);
            obj.message();
            comp.compile();
    }
}


