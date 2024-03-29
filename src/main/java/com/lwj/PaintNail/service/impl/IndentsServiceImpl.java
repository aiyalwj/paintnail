package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.entity.Indents;
import com.lwj.PaintNail.service.IndentsService;
import com.lwj.PaintNail.mapper.IndentsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author wz111
* @description 针对表【Indents】的数据库操作Service实现
* @createDate 2022-11-16 12:00:26
*/
@Service
public class IndentsServiceImpl extends ServiceImpl<IndentsMapper, Indents>
    implements IndentsService{
    @Override
    @Transactional
    public String createIndent(Indents indents) {
        return null;
    }
}




