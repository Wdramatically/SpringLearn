package com.imooc.spring.aop;


import com.imooc.spring.aop.service.EmployeeService;
import com.imooc.spring.aop.service.EmployeeServiceImpl;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;//目标对象
    //构造方法
    private ProxyInvocationHandler(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=====" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()) +"=====");
        Object ret = method.invoke(target, args);//传入要调用方法的对象、参数
        return ret;
    }

    public static void main(String[] args) {
        //目标对象
        EmployeeService employeeService = new EmployeeServiceImpl();
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler(employeeService);
        //动态创建代理类(传入参数：目标对象的类加载器、目标对象的接口、InvocationHandler)
        EmployeeService employeeServiceProxy = (EmployeeService) Proxy.newProxyInstance(employeeService.getClass().getClassLoader(),
                employeeService.getClass().getInterfaces(),
                invocationHandler);
        //用代理对象执行方法
        employeeServiceProxy.createEmployee();
    }
}
