package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Mycollection;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author yangxiaofei
* @description 针对表【Mycollection】的数据库操作Mapper
* @createDate 2022-12-17 14:47:04
* @Entity com.lwj.PaintNail.entity.Mycollection
*/
@Mapper
public interface MycollectionMapper extends BaseMapper<Mycollection> {

    List<Mycollection> listAll(String User_id);
}




