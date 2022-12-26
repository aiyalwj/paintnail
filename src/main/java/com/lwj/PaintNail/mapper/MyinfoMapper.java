package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Myinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wz111
* @description 针对表【Myinfo】的数据库操作Mapper
* @createDate 2022-12-21 16:05:46
* @Entity com.lwj.PaintNail.entity.Myinfo
*/
@Mapper
public interface MyinfoMapper extends BaseMapper<Myinfo> {

    Myinfo SelectMyinfoByUId(String User_id);

}




