package com.guiyunli.rxjava.testproxy;

/**
 * @Author Li Gui Yun
 * @date 2019年02月22日19:10
 * @email guiyun.li@aihuishou.com
 **/
public class Person {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("我开始设置Name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void chifan(){
        System.out.println("我喜欢吃饭");
    }

    @Override
    public String toString() {
        return "我知道了" + age + "--------------------" + name;
    }
}
