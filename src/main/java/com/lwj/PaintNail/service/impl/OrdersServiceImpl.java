package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Orders;
import com.lwj.PaintNail.service.OrdersService;
import com.lwj.PaintNail.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author wz111
* @description 针对表【Orders】的数据库操作Service实现
* @createDate 2022-12-07 18:40:50
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    @Transactional
    public RespBean listCount(String maccount) {
        Integer count=ordersMapper.listCount(maccount);
        return RespBean.success(count);
    }

    @Override
    @Transactional
    public RespBean listOrder(String account) {
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(dateFormat.format(date));

//        Integer total=0;
        List<Orders> ordersList1=ordersMapper.listOrd1(account);
        List<Orders> ordersList2=ordersMapper.listOrd2(account,ordersList1.get(0).getIndentStart());
        Integer total=0;
        for(int i=0; i<ordersList2.size(); i++){
            total+=ordersList2.get(i).getProjectCost();

        }
        return RespBean.success(ordersList2);
    }

    @Override
    @Transactional
    public RespBean listAllOrder(String account) {
        List<Orders> ordersList=ordersMapper.listOrd1(account);
        return RespBean.success(ordersList);
    }

    @Override
    @Transactional
    public RespBean listOrderSim(String account) {
        List<Orders> ordersList=ordersMapper.listOrdSim(account);
        return RespBean.success(ordersList);
    }
}




