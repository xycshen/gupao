package com.gupaoedu.test.prototype.entity;

/**
 * @Auther: xiyou
 * @Date: 2019/4/27 16:23
 * @Description:
 */
public class HumanCloning {

    private String name;

    private int age;

    private String clonNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClonNo() {
        return clonNo;
    }

    public void setClonNo(String clonNo) {
        this.clonNo = clonNo;
    }

    @Override public String toString() {
        return "HumanCloning{" + "name='" + name + '\'' + ", age=" + age + ", clonNo='" + clonNo + '\'' + '}';
    }
}
