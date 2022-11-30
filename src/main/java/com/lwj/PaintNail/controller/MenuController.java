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
@Api(value = "主页")
@RequestMapping("/home")
public class MenuController {

    @Autowired
    private ManicuristsService manicuristsService;

    @ApiOperation(value = "列出所有美甲师")
    @GetMapping("/listAll")
    public RespBean listAllMst() {
        return manicuristsService.listAll();
    }

    //@ApiOperation(value = "")


}
