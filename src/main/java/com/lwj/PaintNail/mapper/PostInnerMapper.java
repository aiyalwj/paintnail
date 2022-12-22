package com.lwj.PaintNail.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwj.PaintNail.entity.PostInner;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yangxiaofei
* @description 针对表【Post_inner】的数据库操作Mapper
* @createDate 2022-12-12 20:21:24
* @Entity com.lwj.PaintNail.entity.PostInner
*/
@Mapper
public interface PostInnerMapper extends BaseMapper<PostInner> {

    PostInner selectByPostId(String post_id);
}




