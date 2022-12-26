package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Collection_post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yangxiaofei
* @description 针对表【Collection】的数据库操作Mapper
* @createDate 2022-12-17 14:46:49
* @Entity com.lwj.PaintNail.entity.Collection
*/
@Mapper
public interface CollectionMapper extends BaseMapper<Collection_post> {

    void CollectPost(String Collection_id, String Post_id, String User_id);
}




