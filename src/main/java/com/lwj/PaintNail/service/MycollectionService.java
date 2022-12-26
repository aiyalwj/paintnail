package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Mycollection;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author yangxiaofei
* @description 针对表【Mycollection】的数据库操作Service
* @createDate 2022-12-17 14:47:04
*/
public interface MycollectionService extends IService<Mycollection> {

    RespBean ListAllCollection(String user_id);
}
