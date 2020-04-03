package com.unfbx.tellmewhy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.unfbx.tellmewhy.dao")
@EnableCaching
public class TellmewhyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TellmewhyApplication.class, args);
    }

}
