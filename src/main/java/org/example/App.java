package org.example;


import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


//        Desktop dt = context.getBean("com1",Desktop.class);
//        Desktop dt1 = context.getBean("com1",Desktop.class);
//        System.out.println(dt == dt1);
//
//        Desktop dt2 = context.getBean("com2",Desktop.class);
//        Desktop dt3 = context.getBean("com2",Desktop.class);
//        System.out.println(dt2 == dt3);

        Alien alien = context.getBean(Alien.class);
        alien.message();



//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//
//            Alien obj = context.getBean("alien", Alien.class);
//            Computer comp = context.getBean(Laptop.class);
//            obj.message();
//            comp.compile();
    }
}


