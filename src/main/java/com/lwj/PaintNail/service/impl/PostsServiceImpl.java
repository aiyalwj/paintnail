package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.entity.Posts;
import com.lwj.PaintNail.service.PostsService;
import com.lwj.PaintNail.mapper.PostsMapper;
import org.springframework.stereotype.Service;

/**
* @author wz111
* @description 针对表【Posts】的数据库操作Service实现
* @createDate 2022-11-16 12:00:26
*/
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts>
    implements PostsService{

}




