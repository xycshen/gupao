package com.test.pattern.factory.simple;

/**
 * @Auther: xiyou
 * @Date: 2019/4/20 23:50
 * @Description:
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //简单工厂
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.creat("鸡肉").eat();
    }
}
