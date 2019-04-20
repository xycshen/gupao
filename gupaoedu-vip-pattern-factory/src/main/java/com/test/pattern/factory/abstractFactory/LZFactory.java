package com.test.pattern.factory.abstractFactory;

import com.test.pattern.factory.entity.Food;

/**
 * @Auther: xiyou
 * @Date: 2019/4/21 00:22
 * @Description:
 */
public class LZFactory implements AbstractFactory {

    public Food createBread() {
        return new LZBread();
    }

    public Food createChicken() {
        return new LZChicken();
    }
}
