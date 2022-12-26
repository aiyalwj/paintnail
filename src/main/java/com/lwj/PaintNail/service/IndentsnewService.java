package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Indentsnew;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Date;

/**
* @author wz111
* @description 针对表【IndentsNew】的数据库操作Service
* @createDate 2022-12-22 19:33:48
*/
public interface IndentsnewService extends IService<Indentsnew> {
    RespBean createIndent(String id, String tid, String pids, String mid, String Iid, Date starttime);
}
