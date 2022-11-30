package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Manicurists;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author wz111
* @description 针对表【Manicurists】的数据库操作Service
* @createDate 2022-11-16 12:00:26
*/
public interface ManicuristsService extends IService<Manicurists> {
    RespBean doLogin(String account,String password);

    RespBean listAll();
    RespBean getManicuristsInfo(String account);
}
