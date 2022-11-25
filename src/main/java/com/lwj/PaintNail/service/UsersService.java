package com.lwj.PaintNail.service;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author wz111
* @description 针对表【Users】的数据库操作Service
* @createDate 2022-11-26 00:54:24
*/
public interface UsersService extends IService<Users> {
    RespBean doRegister(String account, String pwd, String phone, String school);
    RespBean doLogin(String account, String pwd);
    RespBean updateUserinfo(String account,String phone,String school);
    RespBean deleteUserByAccount(String account);
}
