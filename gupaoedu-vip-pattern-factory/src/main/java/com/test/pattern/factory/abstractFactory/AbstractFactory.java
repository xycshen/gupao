package com.test.pattern.factory.abstractFactory;

import com.test.pattern.factory.entity.Food;

/**
 * @Auther: xiyou
 * @Date: 2019/4/21 00:08
 * @Description:
 */
public interface AbstractFactory {
    Food createBread();

    Food createChicken();
}
