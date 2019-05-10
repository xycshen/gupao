package com.gupaoedu.vip.pattern.strategy.test.server;

/**
 * @Auther: xiyou
 * @Date: 2019/5/10 14:27
 * @Description:
 */
public abstract class BaseServer {
    public abstract String getName();

    public void doServer(String Message) {
        System.out.println("获取信息：" + Message + ",进行服务：" + this.getName());
    }

}
