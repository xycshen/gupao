package com.test.pattern.factory.normal;

import com.test.pattern.factory.entity.Chicken;
import com.test.pattern.factory.entity.Food;

/**
 * @Auther: xiyou
 * @Date: 2019/4/21 00:02
 * @Description:
 */
public class ChickenFactory implements NormalFcatory {

    public Food creat() {
        return new Chicken();
    }
}
