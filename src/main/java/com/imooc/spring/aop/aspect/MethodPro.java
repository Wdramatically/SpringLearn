package com.imooc.spring.aop.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MethodPro {
    @Before("execution(public void com.imooc..Book*.*(..))")
    public void preSales(){
        System.out.println("=====售前服务=====");
    }
    @After("execution(public void com.imooc..Book*.*(..))")
    public void afterSale(){
        System.out.println("=====售后服务=====");
    }
}
