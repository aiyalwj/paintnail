package com.lwj.PaintNail;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.dto.RespBeanEnum;
import com.lwj.PaintNail.entity.Administrators;
import com.lwj.PaintNail.entity.Manicurists;
import com.lwj.PaintNail.entity.Users;
import com.lwj.PaintNail.mapper.AdministratorsMapper;
import com.lwj.PaintNail.mapper.ManicuristsMapper;
import com.lwj.PaintNail.mapper.UsersMapper;
import com.lwj.PaintNail.utils.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaintNailApplicationTests {
//    @Autowired
//    private AdministratorsMapper administratorsMapper;
//    @Autowired
//    private UsersMapper usersMapper;

    @Autowired
    private ManicuristsMapper manicuristsMapper;

    @Test
    void contextLoads(){
//        Administrators administrators=administratorsMapper.selectAdministratorById("00001");
//        Administrators administrators=administratorsMapper.selectAdministratorByName("lwj");
//        System.out.println(administrators);
        Manicurists manicurists=manicuristsMapper.selectManicuristsById("10000001");
        System.out.println(manicurists);

//        if(!"123456".equals(administrators.getAdministratorPwd())) {
//            System.out.println("密码错误");
//        }else{
//            System.out.println("密码正确");
//        }
    }
}
