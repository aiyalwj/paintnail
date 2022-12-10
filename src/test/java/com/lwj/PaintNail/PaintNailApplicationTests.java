package com.lwj.PaintNail;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Administrators;
import com.lwj.PaintNail.entity.Manicurists;
import com.lwj.PaintNail.entity.Users;
import com.lwj.PaintNail.mapper.AdministratorsMapper;
import com.lwj.PaintNail.mapper.ManicuristsMapper;
import com.lwj.PaintNail.mapper.UsersMapper;
import com.lwj.PaintNail.service.OrdersService;
import com.lwj.PaintNail.utils.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootTest
class PaintNailApplicationTests {

    @Autowired
    private ManicuristsMapper manicuristsMapper;

    @Autowired
    private OrdersService ordersService;
    @Test
    void contextLoads(){
        Manicurists manicurists=manicuristsMapper.selectManicuristsById("10001");
        System.out.println(manicurists.getManicuristAccount());

//        if(!"123456".equals(administrators.getAdministratorPwd())) {
//            System.out.println("密码错误");
//        }else{
//            System.out.println("密码正确");
//        }
    }

    @Test
    void TestOrder(){
        System.out.println(ordersService.listOrder("lwj"));
//        for(int i=0; i<ordersList.size(); i++){
//            System.out.println(ordersList.get(i).getIndentStart());
//
//        }
    }

    @Test
    void TestCount(){
        System.out.println(ordersService.listCount("mlwj"));
    }
}
