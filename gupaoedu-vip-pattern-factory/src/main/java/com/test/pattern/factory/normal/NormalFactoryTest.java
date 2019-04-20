package com.test.pattern.factory.normal;

/**
 * @Auther: xiyou
 * @Date: 2019/4/21 00:03
 * @Description:
 */
public class NormalFactoryTest {

    public static void main(String[] args) {
        BreadFactory breadFactory = new BreadFactory();
        breadFactory.creat().eat();

        ChickenFactory chickenFactory = new ChickenFactory();
        chickenFactory.creat().eat();
    }
}
