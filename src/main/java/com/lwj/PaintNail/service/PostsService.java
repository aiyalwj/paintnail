package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Posts;
import com.baomidou.mybatisplus.extension.service.IService;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

/**
* @author wz111
* @description 针对表【Posts】的数据库操作Service
* @createDate 2022-11-16 12:00:26
*/
public interface PostsService extends IService<Posts> {

    RespBean listAll();

    RespBean enterPost(String Post_id);

    RespBean LikePost(String Post_id);

    RespBean Posting(String post_id, String user_id, String post_contents, DateTimeLiteralExpression.DateTime post_date, int post_likes, String post_images);
}
