package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Apply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;

/**
* @author wz111
* @description 针对表【Apply】的数据库操作Mapper
* @createDate 2022-11-25 13:40:49
* @Entity com.lwj.PaintNail.entity.Apply
*/
@Mapper
public interface ApplyMapper extends BaseMapper<Apply> {

    void ApplybeManuicurist(String Apply_id, String User_id, Timestamp Apply_time, String Apply_video, String Apply_state);
}




