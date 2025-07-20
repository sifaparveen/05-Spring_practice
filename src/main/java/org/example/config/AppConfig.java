package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean( name = "com1")
//    public Desktop singletonDesktop() {
//        return new Desktop();
//    }
//
//    @Bean( name = "com2")
//    @Scope("prototype")
//    public Desktop protypeDesktop() {
//        return new Desktop();
//    }
//
//
//    @Bean( name = "com2")
//    public Laptop laptop() {
//        return new Laptop();
//    }
//
//    @Bean
//    public Alien alien( Computer comp) {
//        Alien obj = new Alien();
//        obj.setComp(comp);
//        return obj;
//    }
}
