package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lizq on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class IUserDaoTest {

    @Autowired
    IUserDao userDao;

    @Test
    public void updateUserByCond() throws Exception {
        User user=new User();
        user.setId(4);
        user.setName("lizq");
        user.setPass("123456");
        user.setSex(1);
        userDao.updateUserByCond(user);
    }

    @Test
    public void getUserIn() throws Exception {
        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(userDao.getUserIn(list));
    }

}