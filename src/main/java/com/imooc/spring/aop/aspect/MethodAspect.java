package com.imooc.spring.aop.aspect;


import org.aspectj.lang.JoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

//切面类
public class MethodAspect {
    public void printExecutionTime(JoinPoint joinpoint){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time = sdf.format(new Date());
        //获取拦截的类名
        String className = joinpoint.getTarget().getClass().getName();
        //获取拦截的方法名
        String methodName = joinpoint.getSignature().getName();
        System.out.println("----->" + time + ":" + className + "." + methodName);
    }

}
