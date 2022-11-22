package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author wz111
* @description 针对表【Users】的数据库操作Service
* @createDate 2022-11-16 11:39:30
*/
public interface UsersService extends IService<Users> {
    RespBean doLogin(String account, String pwd);
    RespBean updateUser(Users users);
    RespBean deleteUserByAccount(String account);
}
