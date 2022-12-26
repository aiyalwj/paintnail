package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.PostInner;
import com.lwj.PaintNail.entity.Posts;
import com.lwj.PaintNail.mapper.CollectionMapper;
import com.lwj.PaintNail.service.PostInnerService;
import com.lwj.PaintNail.mapper.PostInnerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author yangxiaofei
* @description 针对表【Post_inner】的数据库操作Service实现
* @createDate 2022-12-12 20:21:24
*/
@Service
public class PostInnerServiceImpl extends ServiceImpl<PostInnerMapper, PostInner>
    implements PostInnerService{
    @Autowired
    private PostInnerMapper postInnerMapper;

    @Override
    @Transactional
    public RespBean enterPost(String post_id){
        PostInner post_inner = postInnerMapper.selectByPostId(post_id);
        return RespBean.success(post_inner);
    }

}




