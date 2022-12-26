package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Apply;
import com.baomidou.mybatisplus.extension.service.IService;

import java.sql.Timestamp;

/**
* @author wz111
* @description 针对表【Apply】的数据库操作Service
* @createDate 2022-11-25 13:40:49
*/
public interface ApplyService extends IService<Apply> {

    RespBean ApplybeManuicurist(String apply_id, String user_id, Timestamp apply_time, String apply_video, String apply_state);
}
