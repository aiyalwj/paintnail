package com.lwj.PaintNail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Availabletime;
import com.lwj.PaintNail.entity.Manicurists;
import com.lwj.PaintNail.entity.Projects;
import com.lwj.PaintNail.service.ManicuristsService;
import com.lwj.PaintNail.mapper.ManicuristsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author wz111
* @description 针对表【Manicurists】的数据库操作Service实现
* @createDate 2022-11-16 12:00:26
*/
@Service
public class ManicuristsServiceImpl extends ServiceImpl<ManicuristsMapper, Manicurists>
    implements ManicuristsService{
    @Autowired
    private ManicuristsMapper manicuristsMapper;

    @Override
    @Transactional
    public RespBean doLogin(String account, String password) {
        if(account == "" || account == null || password == "" || password ==null){
            return RespBean.error(RespBeanEnum.LOGIN_INPUT_EMPTY);
        }

        Manicurists manicurists = manicuristsMapper.selectManicuristsById(account);

        //美甲师不存在
        if(manicurists == null){
            return RespBean.error(RespBeanEnum.MANICURIST_ACCOUNT_NOT_FOUND);
        }

        //加密
//        if(!MD5Utils.inputPassToDBPass(password,manicurists.getSalt()).equals(user.getUserPwd())) {
//            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
//        }
        return RespBean.success(manicurists);
    }

    @Override
    @Transactional
    public RespBean listAll() {
        List<Manicurists> manicuristsList = manicuristsMapper.listAll();
        return RespBean.success(manicuristsList);
    }

    @Override
    @Transactional
    public RespBean listMstInfo(String id) {
        Manicurists manicurists = manicuristsMapper.listMstInfo(id);
        return RespBean.success(manicurists);
    }

    @Override
    @Transactional
    public RespBean listMstPro(String id) {
        List<Projects> projectsList = manicuristsMapper.listMstPro(id);
        return RespBean.success(projectsList);
    }

    @Override
    @Transactional
    public RespBean listAvaTime(String id) {
        List<Availabletime> availabletimeList = manicuristsMapper.listAvaTimeByMId(id);
        return RespBean.success(availabletimeList);
    }




}





