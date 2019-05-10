package com.gupaoedu.vip.pattern.strategy.test.server;

import java.util.HashMap;
import java.util.Map;

public class ServerRouter {
    private static Map<String,BaseServer> map = new HashMap<String,BaseServer>();
    static {
        map.put("auth",new AuthServer());
        map.put("pay",new PayServer());
        map.put("crud",new CrudServer());
    }

    public BaseServer getServer(String key){
        if(!map.containsKey(key)){
            return null;
        }
        return map.get(key);
    }
}
