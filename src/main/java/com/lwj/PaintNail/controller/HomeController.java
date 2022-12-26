package com.lwj.PaintNail.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.mapper.IndentsMapper;
import com.lwj.PaintNail.service.*;
import com.lwj.PaintNail.utils.Getcurrenttime;
import com.lwj.PaintNail.utils.RandomUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
    private IndentsService indentsService;

    @Autowired
    private IndentsnewService indentsnewService;
    @Autowired
    private AvaService avaService;


    @ApiOperation(value = "列出所有美甲师")
    @GetMapping
    @ResponseBody
    public RespBean listAllMst() {
        return manicuristsService.listAll();
    }

    @ApiOperation(value = "列出某美甲师详细信息")
    @GetMapping("/MstInfo")
    @ResponseBody
//    public RespBean listMstInfo(@PathVariable("mid") String mid){
//        return manicuristsService.listMstInfo(mid);
//    }
    public RespBean listMstInfo(@RequestParam("mid") String mid){
        return manicuristsService.listMstInfo(mid);
    }

    @ApiOperation(value = "列出某美甲师项目")
    @GetMapping("/Project/{mid}")
    @ResponseBody
    public RespBean listMstProject(@PathVariable("mid") String mid){
        return manicuristsService.listMstPro(mid);
    }

    @ApiOperation(value = "列出预约人数")
    @GetMapping("/Projectcount/{maccount}")
    @ResponseBody
    public RespBean listMstProjectCount(@PathVariable("maccount") String maccount){
        return ordersService.listCount(maccount);
    }

    @ApiOperation(value = "列出某美甲师所有可用时间")
    @GetMapping("/AvaTime/{mid}")
    @ResponseBody
    public RespBean listAvaTime(@PathVariable("mid") String mid){
        return avaService.listAvaTime(mid);
    }

    @ApiOperation(value = "模糊查询某美甲师")
    @PostMapping("/searchMstBymaccount")
    @ResponseBody
    public RespBean searchMstBymaccount(@RequestParam("maccount") String maccount){
        return manicuristsService.searchMst(maccount);
    }

//        @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") //返回时间类型
    //@DateTimeFormat(pattern=“yyyy-MM-dd HH:mm:ss”) //接收时间类型
//    private Date starttime;
    @ApiOperation(value = "预约")
    @PostMapping("/Order")
    @ResponseBody
    public RespBean startOrder(@RequestParam("id") String id,
                               @RequestParam("tid") String tid,
                               @RequestParam("pid") String pid,
                               @RequestParam("mid") String mid){
                               //@RequestParam("Iid") String Iid)
                               //@RequestParam("starttime") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date starttime){
        String Iid = RandomUtils.generateTicket();
        java.sql.Timestamp starttime = Getcurrenttime.getDate();//获取当前时间

        return indentsService.createIndent(id, tid, pid, mid, Iid, starttime);

    }

    @ApiOperation(value = "预约新")
    @PostMapping("/OrderNew")
    @ResponseBody
    public RespBean startOrderNew(@RequestParam("id") String id,
                               @RequestParam("tid") String tid,
                               @RequestParam("pids") String pids,
                               @RequestParam("mid") String mid){
        //@RequestParam("Iid") String Iid)
        //@RequestParam("starttime") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date starttime){
        String Iid = RandomUtils.generateTicket();
        java.sql.Timestamp starttime = Getcurrenttime.getDate();//获取当前时间

        return indentsnewService.createIndent(id, tid, pids, mid, Iid, starttime);

    }

//    @ApiOperation(value = "修改预约时间")
//    @PostMapping("/updateOrder")
//    @ResponseBody
//    public RespBean startOrder2(@RequestParam("id") String id,
//                               @RequestParam("tid") String tid,
//                               @RequestParam("pid") String pid,
//                               @RequestParam("mid") String mid){
//
//        java.sql.Timestamp starttime = Getcurrenttime.getDate();//获取当前时间
//
//        return indentsService.createIndent(id, tid, pid, mid, Iid, starttime);
//
//    }
    @ApiOperation(value = "列出订单信息")
    @GetMapping("/Order/{uaccount}")
    @ResponseBody
    public RespBean listIndent(@PathVariable("uaccount") String uaccount){
        return ordersService.listOrder(uaccount);
    }


}
