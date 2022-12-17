package com.lwj.PaintNail.controller;


import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Mycollection;
import com.lwj.PaintNail.service.MycollectionService;
import com.lwj.PaintNail.service.MyinfoService;
import com.lwj.PaintNail.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Api(tags = "我的信息")
@RequestMapping("/Myinformation")
public class MyinfoController {
    @Autowired
    private MyinfoService myinfoService;
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private MycollectionService mycollectionService;

    @ApiOperation(value = "我的信息界面")
    @RequestMapping(method = RequestMethod.GET)
    public RespBean SelectMyinfoByUId(@RequestParam("User_id") String User_id){
        return myinfoService.SelectMyinfoByUId(User_id);
    }

    @ApiOperation(value = "我的收藏")
    @RequestMapping("/MyCollectioin")
    public RespBean ListAllCollection(@RequestParam("User_id") String User_id){
        return mycollectionService.ListAllCollection(User_id);
    }

    @ApiOperation(value = "列出简略订单信息")
    @GetMapping("/OrderSim/{account}")
    public RespBean listIndetSim(@PathVariable("account") String account) {
        return ordersService.listOrderSim(account);
    }

    @ApiOperation(value = "列出所有订单信息")
    @GetMapping("/Order/{account}")
    public RespBean listIndet(@PathVariable("account") String account) {
        return ordersService.listAllOrder(account);
    }


}
