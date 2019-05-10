package com.gupaoedu.vip.pattern.strategy.test;

import com.gupaoedu.vip.pattern.strategy.test.server.ServerRouter;

/**
 * @Auther: xiyou
 * @Date: 2019/5/10 14:20
 * @Description:
 */
public class Gateway {

    public static void main(String[] args) {
        ServerRouter serverRouter = new ServerRouter();
        serverRouter.getServer("pay").doServer("用户支付请求");
    }

}
