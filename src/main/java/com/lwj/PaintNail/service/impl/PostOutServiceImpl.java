package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.PostOut;
import com.lwj.PaintNail.entity.Posts;
import com.lwj.PaintNail.service.PostOutService;
import com.lwj.PaintNail.mapper.PostOutMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author yangxiaofei
* @description 针对表【Post_out】的数据库操作Service实现
* @createDate 2022-12-12 20:22:52
*/
@Service
public class PostOutServiceImpl extends ServiceImpl<PostOutMapper, PostOut>
    implements PostOutService{
    @Autowired
    private PostOutMapper postOutMapper;

    @Override
    @Transactional
    public RespBean listAll(){
        List<PostOut> Listposts = postOutMapper.listAll();
        return RespBean.success(Listposts);
    }

}




