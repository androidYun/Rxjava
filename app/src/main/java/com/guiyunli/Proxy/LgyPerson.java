package com.guiyunli.Proxy;

/**
 * @Author Li Gui Yun
 * @date 2019年01月30日14:07
 * @email guiyun.li@aihuishou.com
 **/
public class LgyPerson implements Person,Test {
    @Override
    public void eat(String foodName) {
        System.out.println("吃饭就完了");
    }

    @Override
    public void speak(String languageName) {
        System.out.println("唱就完了");
    }

    @Override
    public void printTest() {
        System.out.println("开始");
    }
}
