package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Ava;
import com.lwj.PaintNail.entity.Availabletime;
import com.lwj.PaintNail.service.AvaService;
import com.lwj.PaintNail.mapper.AvaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author wz111
* @description 针对表【Ava】的数据库操作Service实现
* @createDate 2022-12-08 18:44:18
*/
@Service
public class AvaServiceImpl extends ServiceImpl<AvaMapper, Ava>
    implements AvaService{

    @Autowired
    private AvaMapper avaMapper;
    @Override
    @Transactional
    public RespBean listAvaTime(String mid) {
        List<Ava> availabletimeList = avaMapper.avaList(mid);
        return RespBean.success(availabletimeList);
    }
}




