package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Indentsnew;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
* @author wz111
* @description 针对表【IndentsNew】的数据库操作Mapper
* @createDate 2022-12-22 19:33:48
* @Entity com.lwj.PaintNail.entity.Indentsnew
*/
@Mapper
public interface IndentsnewMapper extends BaseMapper<Indentsnew> {
    void insertIndents(@Param("id") String id, @Param("tid") String tid, @Param("pid") String pid, @Param("mid") String mid, @Param("Iid") String Iid, @Param("starttime") Date starttime);

    void updateTime(@Param("tid") String tid);
}




