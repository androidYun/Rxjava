package com.guiyunli.rxjava.testproxy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.guiyunli.rxjava.R;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Li Gui Yun
 * @date 2019年02月22日19:09
 * @email guiyun.li@aihuishou.com
 **/
public class ProxyActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_transfer = findViewById(R.id.btn_transfer);

        Button btn_quit = findViewById(R.id.btn_quit);
        btn_transfer.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Person person = getPersonForClass();
                                                if (person != null) {
//                                                    person.setAge(5555);
//                                                    person.setName("开心");
//                                                    printPersonInfor();
//                                                    getDeclaredMethods();
//                                                    executeMethod();
                                                    executeMethod();
                                                }

                                            }
                                        }
        );
    }


    private Person getPersonForPersonName() {
        try {
            Class<?> aClass = Class.forName("com.guiyunli.rxjava.testproxy.Person");
            try {
                return (Person) aClass.newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    private Person getPersonForClass() {

        Class<Person> aClass = Person.class;
        try {
            return (Person) aClass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void printPersonInfor() {
        Class<Person> aClass = Person.class;
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println("我class所有方法" + method.toString());
        }
    }

    private void getDeclaredMethods() {
        Class<Person> aClass = Person.class;
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("我class所有方法包括私有" + method.toString());
        }
    }

    private void executeMethod() {
        Class<Person> aClass = Person.class;
        try {
            Method method = aClass.getDeclaredMethod("setName", String.class);
            try {
                try {
                    method.invoke(aClass.newInstance(), "我很烦人");
                    System.out.println("我"+method.getDeclaringClass().getName());
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
