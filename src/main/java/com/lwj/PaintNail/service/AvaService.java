package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Ava;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lwj.PaintNail.entity.Availabletime;

import java.util.List;

/**
* @author wz111
* @description 针对表【Ava】的数据库操作Service
* @createDate 2022-12-08 18:44:18
*/
public interface AvaService extends IService<Ava> {
    public RespBean listAvaTime(String mid);
}
