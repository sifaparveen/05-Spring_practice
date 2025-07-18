package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean( name = "com1")
    public Desktop singletonDesktop() {
        return new Desktop();
    }

    @Bean( name = "com2")
    @Scope("prototype")
    public Desktop protypeDesktop() {
        return new Desktop();
    }
}
