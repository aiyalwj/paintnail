package com.lwj.PaintNail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@ComponentScan(basePackages = {})
//@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.lwj.PaintNail.mapper")
//@ComponentScan("com.lwj.PaintNail.config")
public class PaintNailApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaintNailApplication.class,args);
        System.out.println("连接成功");
    }
}