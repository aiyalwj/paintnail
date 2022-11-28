package com.lwj.PaintNail.mapper;

import com.lwj.PaintNail.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wz111
* @description 针对表【Users】的数据库操作Mapper
* @createDate 2022-11-26 00:54:24
* @Entity com.lwj.PaintNail.entity.Users
*/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    Users selectUsersById(@Param("id") String id);

    Users selectUsersByAccount(@Param("account") String account);

    List<Users> listAll();

    List<Users> listALlByAccount(@Param("account") String account);

    void updateUsersInfo(@Param("account")String account,@Param("phone")String phone,@Param("school")String school);

    void registerUsers(Users users);

    void deleteUsersByAccount(@Param("account") String account);
}




