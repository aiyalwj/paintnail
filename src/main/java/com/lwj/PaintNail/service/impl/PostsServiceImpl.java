package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Posts;
import com.lwj.PaintNail.service.PostsService;
import com.lwj.PaintNail.mapper.PostsMapper;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

/**
* @author wz111
* @description 针对表【Posts】的数据库操作Service实现
* @createDate 2022-11-16 12:00:26
*/
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts>
    implements PostsService{
    @Autowired
    private PostsMapper postsMapper;

    @Override
    @Transactional
    public RespBean listAll(){
        List<Posts> Listposts = postsMapper.listAll();
        return RespBean.success(Listposts);
    }

    @Override
    @Transactional
    public RespBean enterPost(String Post_id){
        Posts posts = postsMapper.selectByPostId(Post_id);
        return RespBean.success(posts);
    }

    @Override
    @Transactional
    public RespBean LikePost(String Post_id){//残留一个问题，就是第一次点赞与第二次点赞取消的问题
        postsMapper.updateLikesByPostId(Post_id);
        return RespBean.success(RespBeanEnum.SUCCESS);
    }

    @Override
    @Transactional
    public RespBean Posting(String Post_id, String User_id, String Post_introduction, String Post_contents,
                            java.sql.Timestamp Post_date, int Post_likes, String Post_images){
        postsMapper.Posting(Post_id, User_id, Post_contents, Post_date, Post_likes, Post_images);
        return  RespBean.success(RespBeanEnum.SUCCESS);
    }
}




