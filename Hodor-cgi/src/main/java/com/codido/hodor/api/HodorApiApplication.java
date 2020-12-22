package com.codido.hodor.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.codido.hodor.core.mapper")
public class HodorApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HodorApiApplication.class, args);
    }

}
