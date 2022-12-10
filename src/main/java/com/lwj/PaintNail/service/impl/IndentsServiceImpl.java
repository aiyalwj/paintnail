package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Indents;
import com.lwj.PaintNail.service.IndentsService;
import com.lwj.PaintNail.mapper.IndentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
* @author wz111
* @description 针对表【Indents】的数据库操作Service实现
* @createDate 2022-11-16 12:00:26
*/
@Service
public class IndentsServiceImpl extends ServiceImpl<IndentsMapper, Indents>
    implements IndentsService{
    @Autowired
    private IndentsMapper indentsMapper;

    @Override
    @Transactional
    public RespBean createIndent(String id, String tid, String pid, String mid, String Iid, Date starttime) {
        Indents indents=new Indents();
        indents.setUserId(id);
        indents.setTimeId(tid);
        indents.setProjectId(pid);
        indents.setManicuristId(mid);
        indents.setIndentId(Iid);
        indents.setIndentStart(starttime);

        indentsMapper.insertIndents(id, tid, pid, mid, Iid, starttime);
        return RespBean.success(indents);
    }
}




