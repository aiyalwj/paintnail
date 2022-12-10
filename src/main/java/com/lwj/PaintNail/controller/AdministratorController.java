package com.lwj.PaintNail.controller;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.service.AdministratorsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "管理员登录、注册")
@RequestMapping({"/administrator"})
public class AdministratorController {
    private static final Logger log = LoggerFactory.getLogger(AdministratorController.class);
    @Autowired
    private AdministratorsService administratorsService;

    public AdministratorController() {
    }

    @ApiOperation("管理员登录")
    @GetMapping({"/login"})
    public RespBean doLogin(@RequestParam("id") String id, @RequestParam("pwd") String pwd) {
        return this.administratorsService.doLogin(id, pwd);
    }
}
