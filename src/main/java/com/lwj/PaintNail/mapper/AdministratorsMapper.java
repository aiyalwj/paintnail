package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Administrators;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwj.PaintNail.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wz111
* @description 针对表【Administrators】的数据库操作Mapper
* @createDate 2022-11-16 12:00:26
* @Entity com.lwj.PaintNail.entity.Administrators
*/
@Mapper
public interface AdministratorsMapper extends BaseMapper<Administrators> {
    Administrators selectAdministratorById(@Param("id") String id);

    Administrators selectAdministratorByName(@Param("name") String name);

    List<Administrators> listAll();
}




