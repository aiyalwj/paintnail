package com.lwj.PaintNail.controller;

import com.lwj.PaintNail.service.ManicuristsService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
 */
@RestController
@Slf4j

/**
 * @Api：用在请求的类上，表示对类的说明
 *
 * tags="说明该类的作用，可以在UI界面上看到的注解"
 *
 * value="该参数没什么意义，在UI界面上也看到，所以不需要配置"
 */
@Api(value = "美甲师详情页")
@RequestMapping("/manicuristinfo")
public class ManicuristInfoController {
    @Autowired
    private ManicuristsService manicuristsService;


}
