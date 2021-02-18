package com.imooc.spring.aop.service;

import com.imooc.spring.aop.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserDao userDao;

    public void createUser(){
        System.out.println("执行业务逻辑！");
        userDao.insert();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
