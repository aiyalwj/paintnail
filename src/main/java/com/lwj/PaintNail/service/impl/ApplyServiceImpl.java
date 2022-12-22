package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Apply;
import com.lwj.PaintNail.service.ApplyService;
import com.lwj.PaintNail.mapper.ApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
* @author wz111
* @description 针对表【Apply】的数据库操作Service实现
* @createDate 2022-11-25 13:40:49
*/
@Service
public class ApplyServiceImpl extends ServiceImpl<ApplyMapper, Apply>
    implements ApplyService{
    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public RespBean ApplybeManuicurist(String apply_id, String user_id, Timestamp apply_time, String apply_video, String apply_state) {
        applyMapper.ApplybeManuicurist(apply_id, user_id, apply_time, apply_video, apply_state);
        return RespBean.success(RespBeanEnum.SUCCESS);
    }
}




