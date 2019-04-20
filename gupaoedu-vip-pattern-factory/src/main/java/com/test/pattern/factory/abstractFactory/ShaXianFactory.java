package com.test.pattern.factory.abstractFactory;

import com.test.pattern.factory.entity.Food;

/**
 * @Auther: xiyou
 * @Date: 2019/4/21 00:13
 * @Description:
 */
public class ShaXianFactory implements AbstractFactory {

    public Food createBread() {
        return new ShaXianBread();
    }

    public Food createChicken() {
        return new ShaXianChicken();
    }
}
