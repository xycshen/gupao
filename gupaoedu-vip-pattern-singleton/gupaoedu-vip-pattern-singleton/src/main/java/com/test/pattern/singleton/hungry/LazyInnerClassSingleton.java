package com.test.pattern.singleton.hungry;

/**
 * @Auther: xiyou
 * @Date: 2019/4/27 12:19
 * @Description:
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(InnerClass.LAZY != null){
            throw new RuntimeException("已经有该实例");
        }
    }

    public LazyInnerClassSingleton getInstance(){
        return InnerClass.LAZY;
    }

    private static class InnerClass{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
