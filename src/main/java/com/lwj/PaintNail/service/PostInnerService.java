package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lwj.PaintNail.entity.PostInner;
import com.lwj.PaintNail.entity.Posts;

/**
* @author yangxiaofei
* @description 针对表【Post_inner】的数据库操作Service
* @createDate 2022-12-12 20:21:24
*/
public interface PostInnerService extends IService<PostInner> {

    RespBean enterPost(String post_id);

}
