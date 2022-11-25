package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.entity.Time;
import com.lwj.PaintNail.service.TimeService;
import com.lwj.PaintNail.mapper.TimeMapper;
import org.springframework.stereotype.Service;

/**
* @author wz111
* @description 针对表【Time】的数据库操作Service实现
* @createDate 2022-11-26 00:54:24
*/
@Service
public class TimeServiceImpl extends ServiceImpl<TimeMapper, Time>
    implements TimeService{

}




