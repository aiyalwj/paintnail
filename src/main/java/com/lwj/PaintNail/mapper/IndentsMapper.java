package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Indents;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
* @author wz111
* @description 针对表【Indents】的数据库操作Mapper
* @createDate 2022-12-06 15:58:25
* @Entity com.lwj.PaintNail.entity.Indents
*/
@Mapper
public interface IndentsMapper extends BaseMapper<Indents> {
    void insertIndents(@Param("id") String id, @Param("tid") String tid, @Param("pid") String pid, @Param("mid") String mid, @Param("Iid") String Iid, @Param("starttime") Date starttime);

    void updateTime(@Param("tid") String tid);
}




