package com.test.pattern.factory.abstractFactory;

/**
 * @Auther: xiyou
 * @Date: 2019/4/21 00:25
 * @Description:
 */
public class AbstractorFactoryTest {

    public static void main(String[] args) {
        ShaXianFactory shaxian = new ShaXianFactory();
        shaxian.createBread().eat();
        shaxian.createChicken().eat();

        LZFactory lanzhou = new LZFactory();
        lanzhou.createBread().eat();
        lanzhou.createChicken().eat();
    }
}
