package com.gupaoedu.vip.pattern.proxy.test.cglib;

/**
 * @Auther: xiyou
 * @Date: 2019/5/8 14:58
 * @Description:
 */
public class Star {
    public void advertisement(String ad){
        System.out.println("开始拍摄广告词：" + ad);
    }

    public void rule(String name){
        System.out.println(name+"老板，在下卖身不卖艺！");
    }
}
