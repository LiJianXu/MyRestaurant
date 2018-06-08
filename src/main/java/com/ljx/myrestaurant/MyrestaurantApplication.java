package com.ljx.myrestaurant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ljx.myrestaurant.mapper")
public class MyrestaurantApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyrestaurantApplication.class, args);
    }
}
