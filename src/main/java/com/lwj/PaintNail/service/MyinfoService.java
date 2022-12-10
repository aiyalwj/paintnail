package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Myinfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author yangxiaofei
* @description 针对表【Myinfo】的数据库操作Service
* @createDate 2022-12-08 15:59:30
*/
public interface MyinfoService extends IService<Myinfo> {

    RespBean SelectMyinfoByUId(String user_id);
}
