package com.test.pattern.factory.normal;

import com.test.pattern.factory.entity.Bread;
import com.test.pattern.factory.entity.Food;

/**
 * @Auther: xiyou
 * @Date: 2019/4/21 00:00
 * @Description:
 */
public class BreadFactory implements NormalFcatory {

    public Food creat() {
        return new Bread();
    }
}
