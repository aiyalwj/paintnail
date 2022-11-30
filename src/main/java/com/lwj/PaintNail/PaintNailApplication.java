package com.lwj.PaintNail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableScheduling
@MapperScan("com.lwj.PaintNail.mapper")
//@ComponentScan("com.lwj.PaintNail.config")
public class PaintNailApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaintNailApplication.class,args);
        System.out.println("连接成功");
    }
}
