package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Manicurists;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwj.PaintNail.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author wz111
* @description 针对表【Manicurists】的数据库操作Mapper
* @createDate 2022-11-16 12:00:26
* @Entity com.lwj.PaintNail.entity.Manicurists
*/
@Mapper
public interface ManicuristsMapper extends BaseMapper<Manicurists> {
    Manicurists selectManicuristsById(@Param("id") String id);

    Manicurists selectManicuristsByAccount(@Param("account") String account);
}




