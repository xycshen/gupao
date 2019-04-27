package com.test.pattern.singleton.lazy;

/**
 * @Auther: xiyou
 * @Date: 2019/4/27 12:05
 * @Description:
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton(){}
    private volatile static LazyDoubleCheckSingleton lazy;
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return  lazy;
    }

}
