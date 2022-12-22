package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Collection_post;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author yangxiaofei
* @description 针对表【Collection】的数据库操作Service
* @createDate 2022-12-17 14:46:49
*/
public interface CollectionService extends IService<Collection_post> {

    RespBean CollectPost(String collection_id, String post_id, String user_id);
}
