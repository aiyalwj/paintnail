package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lwj.PaintNail.entity.PostOut;

/**
* @author yangxiaofei
* @description 针对表【Post_out】的数据库操作Service
* @createDate 2022-12-12 20:22:52
*/
public interface PostOutService extends IService<PostOut> {

    RespBean listAll();
}
