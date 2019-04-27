package com.test.pattern.singleton.hungry;

/**
 * @Auther: xiyou
 * @Date: 2019/4/27 11:43
 * @Description:
 */
public class HungryStaticSingleton {
    private HungryStaticSingleton(){}

    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
