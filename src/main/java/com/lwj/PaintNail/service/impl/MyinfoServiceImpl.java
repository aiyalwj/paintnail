package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Myinfo;
import com.lwj.PaintNail.service.MyinfoService;
import com.lwj.PaintNail.mapper.MyinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author yangxiaofei
* @description 针对表【Myinfo】的数据库操作Service实现
* @createDate 2022-12-08 15:59:30
*/
@Service
public class MyinfoServiceImpl extends ServiceImpl<MyinfoMapper, Myinfo>
    implements MyinfoService{
    @Autowired
    private MyinfoMapper myinfoMapper;

    @Override
    @Transactional
    public RespBean SelectMyinfoByUId(String User_id){
        Myinfo myinfo = myinfoMapper.SelectMyinfoByUId(User_id);
        return RespBean.success(myinfo);
    }

}




