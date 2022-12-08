package com.lwj.PaintNail.controller;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.service.ManicuristsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "美甲师")
@RequestMapping("/manicurist")
public class ManicuristController {
    @Autowired
    private ManicuristsService manicuristsService;

    @ApiOperation(value="美甲师登录")
    @GetMapping(value = {"/login"})

    /*
    @RequestParam把请求中的指定名称的参数传递给控制器中的形参赋值
     */
    public RespBean doLogin(@RequestParam("account") String account, @RequestParam("pwd") String pwd) {
        return manicuristsService.doLogin(account, pwd);
    }

}
