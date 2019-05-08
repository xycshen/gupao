package com.gupaoedu.vip.pattern.proxy.test.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: xiyou
 * @Date: 2019/5/8 14:28
 * @Description:
 */
public class PM implements InvocationHandler {
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args);
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("交付需求");
    }

    private void before(Object[] args) {
        System.out.println("确认需求" + args[0]);
        args[0] = "写一个代理模式的例子";
    }
}
