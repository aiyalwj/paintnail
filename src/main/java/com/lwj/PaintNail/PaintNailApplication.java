package com.lwj.PaintNail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@ComponentScan(basePackages = {})
//@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.lwj.PaintNail.mapper")
@EnableWebMvc
//@ComponentScan("com.lwj.PaintNail.config")
public class PaintNailApplication implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/index.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").
//                addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }

    public static void main(String[] args) {
        SpringApplication.run(PaintNailApplication.class,args);
        System.out.println("连接成功");
    }
}