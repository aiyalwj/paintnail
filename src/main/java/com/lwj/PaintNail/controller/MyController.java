package com.lwj.PaintNail.controller;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "我的")
@RequestMapping("/my")
public class MyController {
    @Autowired
    private OrdersService ordersService;

    @ApiOperation(value = "列出简略订单信息")
    @GetMapping("{account}/OrderSim")
    public RespBean listIndetSim(@PathVariable("account") String account) {
        return ordersService.listOrderSim(account);
    }

    @ApiOperation(value = "列出所有订单信息")
    @GetMapping("{account}/Order")
    public RespBean listIndet(@PathVariable("account") String account) {
        return ordersService.listAllOrder(account);
    }
}
