package org.lanqiao.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by lizq on 2017/9/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class UserServiceImplTest {
    @Autowired
    IUserService userService;

    @Test
    public void getAllUser() throws Exception {
        userService.getAllUser();
    }

}