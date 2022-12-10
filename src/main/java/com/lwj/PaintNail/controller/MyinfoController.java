package com.lwj.PaintNail.controller;


import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.service.MyinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(value = "我的信息")
@RequestMapping("/Myinformation")
public class MyinfoController {
    @Autowired
    private MyinfoService myinfoService;

    @ApiOperation(value = "我的信息界面")
    @RequestMapping(method = RequestMethod.GET)
    public RespBean SelectMyinfoByUId(@RequestParam("User_id") String User_id){
        return myinfoService.SelectMyinfoByUId(User_id);
    }
}
