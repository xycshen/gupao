package com.test.pattern.singleton.hungry;

/**
 * @Auther: xiyou
 * @Date: 2019/4/27 10:22
 * @Description:
 */
public class HungrySingleton {
    private HungrySingleton(){}

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
