package com.lwj.PaintNail;

import com.lwj.PaintNail.entity.Users;
import com.lwj.PaintNail.mapper.UsersMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaintNailApplicationTests {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    void contextLoads(){
        Users users=new Users();
        users.setUserAccount("lll");
        users.setUserPwd("000000");
        users.setUserPhone("09812345611");
        users.setUserSchool("zju");
//        usersMapper.deleteUsersByAccount("lwj");
//        usersMapper.updateUsersInfo(users);
        System.out.println(usersMapper.listAll());
    }


    @Test
    void accountIsNull(){
        Users user=usersMapper.selectUsersByAccount("lwj");
        System.out.println(user);
    }

}
