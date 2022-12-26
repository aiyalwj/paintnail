package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Collection_post;
import com.lwj.PaintNail.service.CollectionService;
import com.lwj.PaintNail.mapper.CollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author yangxiaofei
* @description 针对表【Collection】的数据库操作Service实现
* @createDate 2022-12-17 14:46:49
*/
@Service
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection_post>
    implements CollectionService{
    @Autowired
    private CollectionMapper collectionMapper;

    @Override
    public RespBean CollectPost(String collection_id, String post_id, String user_id) {
        collectionMapper.CollectPost(collection_id, post_id, user_id);
        return RespBean.success(RespBeanEnum.SUCCESS);
    }
}




