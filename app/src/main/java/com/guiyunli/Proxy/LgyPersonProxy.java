package com.guiyunli.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/**
 * @Author Li Gui Yun
 * @date 2019年01月30日14:08
 * @email guiyun.li@aihuishou.com
 **/
public class LgyPersonProxy {

    private Person lgy = new LgyPerson();

    private HashMap<String, Object[]> keyMap = new HashMap();

    public Person getProxy() {
        return (Person) Proxy.newProxyInstance(LgyPerson.class.getClassLoader(), lgy.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("eat")) {
                    System.out.println("吃饭" + args[0].toString());
                    save(method.getName(),args);
                    return method.invoke(lgy, args);
                } else if (method.getName().equals("speak")) {
                    System.out.println("说话" + args);
                    return method.invoke(lgy, args);
                }
                Integer integer = Integer.valueOf(1);
                integer.intValue();
                return null;
            }
        });
    }

    private void save(String name, Object[] args) {
        Object[] value = keyMap.get(name);
        if (value == null) {
            keyMap.put(name, args);
        }
    }

}
