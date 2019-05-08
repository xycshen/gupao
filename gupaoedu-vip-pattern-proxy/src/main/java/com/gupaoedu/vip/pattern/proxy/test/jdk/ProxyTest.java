package com.gupaoedu.vip.pattern.proxy.test.jdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: xiyou
 * @Date: 2019/5/8 14:35
 * @Description:
 */
public class ProxyTest {

    public static void main(String[] args) {
        Object obj = new PM().getInstance(new Programmer());
        try {
            Method method = obj.getClass().getMethod("Coding", String.class);
            try {
                method.invoke(obj,"编写代理模式");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
