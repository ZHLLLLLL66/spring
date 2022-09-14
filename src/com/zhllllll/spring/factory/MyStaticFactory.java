package com.zhllllll.spring.factory;

import com.zhllllll.spring.bean.Monster;

import java.util.HashMap;
import java.util.Map;

public class MyStaticFactory {
    private static Map<String, Monster> monsterMap;

    //使用static代码块进行初始化
    //在java基础的时候，讲过的
    static {
        monsterMap = new HashMap<>();
        monsterMap.put("monster01",new Monster(100,"牛魔王","暴力拳头"));
        monsterMap.put("monster02",new Monster(200,"狐狸精","魅惑术"));
    }


    //提供一个方法，返回Monster对象
    public static Monster getMonster(String key){
        return monsterMap.get(key);
    }
}
