package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Administrators;
import com.lwj.PaintNail.entity.Users;
import com.lwj.PaintNail.service.AdministratorsService;
import com.lwj.PaintNail.mapper.AdministratorsMapper;
import com.lwj.PaintNail.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author wz111
* @description 针对表【Administrators】的数据库操作Service实现
* @createDate 2022-11-16 12:00:26
*/
@Service
public class AdministratorsServiceImpl extends ServiceImpl<AdministratorsMapper, Administrators>
    implements AdministratorsService{

    @Autowired
    private AdministratorsMapper administratorsMapper;
    @Override
    public RespBean doLogin(String id, String pwd) {

        if(id == "" || id == null || pwd == "" || pwd ==null){
            return RespBean.error(RespBeanEnum.LOGIN_INPUT_EMPTY);
        }

        Administrators administrators = administratorsMapper.selectAdministratorById(id);

        //用户不存在
        if(administrators == null){
            return RespBean.error(RespBeanEnum.USER_ACCOUNT_NOT_FOUND);
        }

        //加密
//        if(!MD5Utils.inputPassToDBPass(pwd,administrators.getSalt()).equals(user.getUserPwd())) {
//            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
//        }
        return RespBean.success(administrators);
    }
}




