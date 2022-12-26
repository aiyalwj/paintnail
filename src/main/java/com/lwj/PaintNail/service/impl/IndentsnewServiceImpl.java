package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Indents;
import com.lwj.PaintNail.entity.Indentsnew;
import com.lwj.PaintNail.service.IndentsnewService;
import com.lwj.PaintNail.mapper.IndentsnewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
* @author wz111
* @description 针对表【IndentsNew】的数据库操作Service实现
* @createDate 2022-12-22 19:33:48
*/
@Service
public class IndentsnewServiceImpl extends ServiceImpl<IndentsnewMapper, Indentsnew>
    implements IndentsnewService{
    @Autowired
    private IndentsnewMapper indentsnewMapper;
    @Override
    @Transactional
    public RespBean createIndent(String id, String tid, String pids, String mid, String Iid, Date starttime) {
        Indentsnew indentsnew=new Indentsnew();
        indentsnew.setUserId(id);
        indentsnew.setTimeId(tid);
        indentsnew.setProjectIds(pids);
        indentsnew.setManicuristId(mid);
        indentsnew.setIndentId(Iid);
        indentsnew.setIndentStart(starttime);

        indentsnewMapper.insertIndents(id, tid, pids, mid, Iid, starttime);
        return RespBean.success(indentsnew);
    }
}




