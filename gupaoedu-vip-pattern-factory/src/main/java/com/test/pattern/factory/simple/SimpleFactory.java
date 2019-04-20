package com.test.pattern.factory.simple;

import com.test.pattern.factory.entity.Bread;
import com.test.pattern.factory.entity.Chicken;
import com.test.pattern.factory.entity.Food;

/**
 * @Auther: xiyou
 * @Date: 2019/4/20 23:47
 * @Description:
 */
public class SimpleFactory {

    public Food creat(String food){
        if(food.equals("鸡肉")){
            return new Chicken();
        }else if(food.equals("面包")){
            return  new Bread();
        }else{
            return null;
        }
    }
}
