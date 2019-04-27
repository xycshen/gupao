package com.gupaoedu.test.prototype;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: xiyou
 * @Date: 2019/4/27 16:26
 * @Description:
 */
public class ClonUtil {

    public static void copyProperties(Object source, Object target)  {
        doCopyProperties(source,target);
    }

    private static void doCopyProperties(Object source, Object target) {
        Map<String,Method> map = new HashMap<String, Method>();
        //将源对象的属性保存
        Method[] gmethods = source.getClass().getMethods();
        for(Method gmethod : gmethods){
            if(gmethod.getName().startsWith("get")){
                String name = gmethod.getName().replace("get","");
                map.put(name,gmethod);
            }
        }

        Method[] smethods = target.getClass().getMethods();
        for (Method smethod : smethods) {
            if(smethod.getName().startsWith("set")){
                String name = smethod.getName().replace("set","");
                Method gmethod = null;
                if (!map.containsKey(name)){continue;}
                try {
                    gmethod = source.getClass().getMethod("get"+name);
                    smethod.invoke(target,gmethod.invoke(source));
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
