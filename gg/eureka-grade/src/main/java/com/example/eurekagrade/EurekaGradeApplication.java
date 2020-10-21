package com.example.eurekagrade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.example.eurekagrade.mapper")
public class EurekaGradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGradeApplication.class, args);
    }

}
