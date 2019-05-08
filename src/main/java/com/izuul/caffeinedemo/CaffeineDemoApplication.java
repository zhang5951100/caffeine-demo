package com.izuul.caffeinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//启用缓存
@EnableCaching
public class CaffeineDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaffeineDemoApplication.class, args);
    }

}
