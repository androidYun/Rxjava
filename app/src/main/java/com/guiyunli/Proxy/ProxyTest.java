package com.guiyunli.Proxy;

/**
 * @Author Li Gui Yun
 * @date 2019年01月30日14:13
 * @email guiyun.li@aihuishou.com
 **/
public class ProxyTest {
    public static void main(String[] args) {
//        LgyPersonProxy lgyPersonProxy = new LgyPersonProxy();
//        Person proxy = lgyPersonProxy.getProxy();
//        proxy.eat("面条");
//        proxy.speak("英语");
        LgyPerson person=new LgyPerson();
        Class<?>[] interfaces = person.getClass().getInterfaces();
        System.out.println("数据"+interfaces.length);
        for (Class<?> clas:interfaces){
            System.out.println(clas.getName());
        }
    }


}
