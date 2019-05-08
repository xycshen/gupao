package com.gupaoedu.vip.pattern.proxy.test.cglib;

/**
 * @Auther: xiyou
 * @Date: 2019/5/8 15:08
 * @Description:
 */
public class ProxyTest {

    public static void main(String[] args) {
        Star obj = (Star) new Agent().getInstance(Star.class);
        obj.advertisement("不是哪种牛奶都叫特仑苏");
        obj.rule("豹头");
    }
}
