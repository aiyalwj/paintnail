package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.PostOut;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author yangxiaofei
* @description 针对表【Post_out】的数据库操作Mapper
* @createDate 2022-12-12 20:22:52
* @Entity com.lwj.PaintNail.entity.PostOut
*/
@Mapper
public interface PostOutMapper extends BaseMapper<PostOut> {

    List<PostOut> listAll();
}




