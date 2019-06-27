package com.qf.springboot_thymeleaf_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringbootThymeleafDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootThymeleafDemoApplication.class, args);
    }

}
