package com.hmall;

import com.hmall.item.ItemApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hmall.mapper")
@SpringBootApplication
public class HMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }
}