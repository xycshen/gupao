package com.test.pattern.singleton.lazy;

/**
 * @Auther: xiyou
 * @Date: 2019/4/27 11:28
 * @Description:
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton lazy = null;

    public synchronized static LazySingleton getInstance(){
        if(lazy == null){
            return new LazySingleton();
        }

        return lazy;
    }
}
