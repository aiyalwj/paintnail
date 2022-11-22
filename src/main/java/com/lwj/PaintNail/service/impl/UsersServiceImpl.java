package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Users;
import com.lwj.PaintNail.service.UsersService;
import com.lwj.PaintNail.mapper.UsersMapper;
import com.lwj.PaintNail.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
* @author wz111
* @description 针对表【Users】的数据库操作Service实现
* @createDate 2022-11-16 11:39:30
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 登录账号
     * @param account
     * @param password
     * @return
     */
    @Override
    @Transactional
    public RespBean doLogin(String account, String password) {
        if(account == "" || account == null || password == "" || password ==null){
            return RespBean.error(RespBeanEnum.LOGIN_INPUT_EMPTY);
        }

        Users user = usersMapper.selectUsersByAccount(account);

        //用户不存在
        if(user == null){
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_NOT_FOUND);
        }

        //加密
        if(!MD5Utils.inputPassToDBPass(password,user.getSalt()).equals(user.getUserPwd())) {
                return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        }
        return RespBean.success(user);
    }

    @Override
    @Transactional
    public RespBean updateUser(Users users) {
        return null;
    }

    /**
     * 注销账号
     * @param account
     * @return
     */
    @Override
    @Transactional
    public RespBean deleteUserByAccount(String account) {
        Users user = usersMapper.selectUsersByAccount(account);
        //account为空
        if (account.equals("") || account == null){
            return RespBean.error(RespBeanEnum.MODIFY_NICKNAME_EMPTY);
        }

        //用户不存在
        if(user == null){
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_NOT_FOUND);
        }
        usersMapper.deleteUsersByAccount(account);
        return RespBean.success();
    }
}




