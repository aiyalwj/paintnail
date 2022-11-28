package com.lwj.PaintNail.controller;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Api(value = "用户登录、注册")
@RequestMapping("/user")
public class UserLoginController {

    @Autowired
    private UsersService usersService;

    //表示一个http请求的操作
    /* @ApiOperation(value = “接口说明”, httpMethod = “接口请求方式”, response =
    “接口返回参数类型”, notes = “接口发布说明”；
    */
    @ApiOperation(value="用户登录")

    /*
    @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。
     */
    @GetMapping(value = {"/userlogin"})

    /*
    @RequestParam把请求中的指定名称的参数传递给控制器中的形参赋值
     */
    public RespBean doLogin(@RequestParam("id") String id, @RequestParam("pwd") String pwd) {
        return usersService.doLogin(id, pwd);
    }

}
