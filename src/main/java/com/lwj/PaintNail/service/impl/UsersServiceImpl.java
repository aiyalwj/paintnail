package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Users;
import com.lwj.PaintNail.service.UsersService;
import com.lwj.PaintNail.mapper.UsersMapper;
import com.lwj.PaintNail.utils.MD5Utils;
import com.lwj.PaintNail.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author wz111
* @description 针对表【Users】的数据库操作Service实现
* @createDate 2022-11-26 00:54:24
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 注册账户
     * @param account
     * @param pwd
     * @param phone
     * @param school
     * @return
     */
    @Override
    @Transactional
    public RespBean doRegister(String account, String pwd, String phone, String school) {
        if(account == "" || account == null){
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_EMPTY);
        }
        if(usersMapper.selectUsersByAccount(account) == null){
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_NOT_FOUND);
        }
        Users user=new Users();
        user.setUserId(RandomUtils.generateTicket());
        user.setUserAccount(account);
        user.setUserPwd(pwd);
        user.setUserPhone(phone);
        user.setUserSchool(school);
        usersMapper.registerUsers(user);

        return RespBean.success(user);
    }

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
//        if(!MD5Utils.inputPassToDBPass(password,user.getSalt()).equals(user.getUserPwd())) {
        if(!password.equals(user.getUserPwd())) {
            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        }
        return RespBean.success(user);
    }


    /**
     * 更新账号信息 电话，学校
     * @param account
     * @param phone
     * @param school
     * @return
     */
    @Override
    @Transactional
    public RespBean updateUserinfo(String account, String phone, String school) {
        //账号为空
        if(account.equals("") || account == null){
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_EMPTY);
        }
        Users user = usersMapper.selectUsersByAccount(account);
        //用户不存在
        if(user == null){
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_NOT_FOUND);
        }

        usersMapper.updateUsersInfo(account,phone,school);
        return RespBean.success();
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
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_EMPTY);
        }

        //用户不存在
        if(user == null){
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_NOT_FOUND);
        }
        usersMapper.deleteUsersByAccount(account);
        return RespBean.success();
    }
}




