package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Ava;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wz111
* @description 针对表【Ava】的数据库操作Mapper
* @createDate 2022-12-08 18:44:18
* @Entity com.lwj.PaintNail.entity.Ava
*/
@Mapper
public interface AvaMapper extends BaseMapper<Ava> {
    List<Ava> avaList(@Param("mid") String mid);
}




