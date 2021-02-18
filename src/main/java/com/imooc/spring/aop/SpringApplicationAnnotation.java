package com.imooc.spring.aop;

import com.imooc.spring.aop.entity.BookShop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContextAnnotation.xml");
        BookShop bookShop = context.getBean("bookShop", BookShop.class);
        bookShop.sellingBooks();
    }

}
