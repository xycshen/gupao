package com.test.pattern.singleton.enums;

public enum EnumSingleton {
    ENUM_SINGLETON;
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance(){
        return ENUM_SINGLETON;
    }
}
