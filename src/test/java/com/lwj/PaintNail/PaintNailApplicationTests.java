package com.lwj.PaintNail;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Manicurists;
import com.lwj.PaintNail.entity.Orders;
import com.lwj.PaintNail.mapper.ManicuristsMapper;
import com.lwj.PaintNail.mapper.OrdersMapper;
import com.lwj.PaintNail.service.ManicuristsService;
import com.lwj.PaintNail.service.OrdersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
@EnableTransactionManagement
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
