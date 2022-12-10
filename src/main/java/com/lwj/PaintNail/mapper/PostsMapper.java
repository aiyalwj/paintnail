package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Posts;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
* @author wz111
* @description 针对表【Posts】的数据库操作Mapper
* @createDate 2022-11-16 12:00:26
* @Entity com.lwj.PaintNail.entity.Posts
*/
@Mapper
public interface PostsMapper extends BaseMapper<Posts> {

    List<Posts> listAll();

    Posts selectByPostId(String Post_id);

    void updateLikesByPostId(String post_id);

    void Posting(String Post_id, String User_id, String Post_contents, java.sql.Timestamp Post_date, Integer Post_likes, String Post_images);
}




