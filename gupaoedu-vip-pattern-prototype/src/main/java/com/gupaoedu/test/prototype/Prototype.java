package com.gupaoedu.test.prototype;

import com.gupaoedu.test.prototype.entity.Human;
import com.gupaoedu.test.prototype.entity.HumanCloning;

/**
 * @Auther: xiyou
 * @Date: 2019/4/27 16:12
 * @Description:
 */
public class Prototype {

    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(18);
        human.setName("珍妮");
        HumanCloning humanCloning = new HumanCloning();
        ClonUtil.copyProperties(human, humanCloning);

        System.out.println(humanCloning.toString());
    }
}
