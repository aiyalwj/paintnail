package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lwj.PaintNail.entity.Orders;

/**
* @author wz111
* @description 针对表【Orders】的数据库操作Service
* @createDate 2022-12-07 18:40:50
*/
public interface OrdersService extends IService<Orders> {
    RespBean listCount(String maccount);
    RespBean listOrder(String account);

    RespBean listAllOrder(String account);

    RespBean listOrderSim(String account);
}
