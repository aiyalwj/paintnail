package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Indents;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
* @author wz111
* @description 针对表【Indents】的数据库操作Service
* @createDate 2022-11-16 12:00:26
*/
public interface IndentsService extends IService<Indents> {
    RespBean createIndent(String id, String tid, String pid, String mid, String Iid, Date starttime);
}
