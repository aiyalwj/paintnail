package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Mycollection;
import com.lwj.PaintNail.service.MycollectionService;
import com.lwj.PaintNail.mapper.MycollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yangxiaofei
* @description 针对表【Mycollection】的数据库操作Service实现
* @createDate 2022-12-17 14:47:04
*/
@Service
public class MycollectionServiceImpl extends ServiceImpl<MycollectionMapper, Mycollection>
    implements MycollectionService{
    @Autowired
    private MycollectionMapper mycollectionMapper;

    @Override
    public RespBean ListAllCollection(String user_id) {
        List<Mycollection> ListMyCollections = mycollectionMapper.listAll(user_id);
        return RespBean.success(ListMyCollections);
    }
}




