package com.imooc.spring.aop.entity;

import org.springframework.stereotype.Repository;

@Repository
public class BookShop {
    public void sellingBooks(){
        System.out.println("卖出一本技术书籍");
    }

}
