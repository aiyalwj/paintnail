package com.lwj.PaintNail.controller;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.service.AvaService;
import com.lwj.PaintNail.service.ManicuristsService;
import com.lwj.PaintNail.service.OrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Api(tags = "主页")
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ManicuristsService manicuristsService;
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private AvaService avaService;

    @ApiOperation(value = "列出所有美甲师")
    @GetMapping("/listMst")
    public RespBean listAllMst() {
        return manicuristsService.listAll();
    }

    @ApiOperation(value = "列出某美甲师详细信息")
    @GetMapping("/MstInfo")
//    public RespBean listMstInfo(@PathVariable("mid") String mid){
//        return manicuristsService.listMstInfo(mid);
//    }
    public RespBean listMstInfo(@RequestParam("mid") String mid){
        return manicuristsService.listMstInfo(mid);
    }

    @ApiOperation(value = "列出某美甲师项目")
    @GetMapping("/Project/{mid}")
    public RespBean listMstProject(@PathVariable("mid") String mid){
        return manicuristsService.listMstPro(mid);
    }

    @ApiOperation(value = "列出预约人数")
    @GetMapping("Project/count/{maccount}")
    public RespBean listMstProjectCount(@PathVariable("maccount") String maccount){
        return ordersService.listCount(maccount);
    }

    @ApiOperation(value = "列出某美甲师所有可用时间")
    @GetMapping("/AvaTime/{mid}")
    @ResponseBody
    public RespBean listAvaTime(@PathVariable("mid") String mid){
        return avaService.listAvaTime(mid);
    }

    @ApiOperation(value = "列出订单信息")
    @GetMapping("/Order/{uaccount}")
    public RespBean listIndent(@PathVariable("uaccount") String uaccount){
        return ordersService.listOrder(uaccount);
    }


}
