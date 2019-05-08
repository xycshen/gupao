package com.gupaoedu.vip.pattern.proxy.test.jdk;

/**
 * @Auther: xiyou
 * @Date: 2019/5/8 14:21
 * @Description:
 */
public class Programmer implements Staff{

    public void Coding(String demand) {
        System.out.println("落地需求" + demand);
        System.out.println("完成任务");
    }
}
