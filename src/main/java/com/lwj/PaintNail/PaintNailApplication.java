package com.lwj.PaintNail;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.mapper.ManicuristsMapper;
import com.lwj.PaintNail.service.ManicuristsService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.lwj.PaintNail.mapper")

public class PaintNailApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaintNailApplication.class,args);
        System.out.println("连接成功");
    }
}
