package com.southwind.drinkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DrinkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrinkshopApplication.class, args);
    }

}
