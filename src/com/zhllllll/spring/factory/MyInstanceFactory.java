package com.zhllllll.spring.factory;


import com.zhllllll.spring.bean.Monster;

import java.util.HashMap;
import java.util.Map;

/*
* 实例工厂类
* */
public class MyInstanceFactory {
    private Map<String, Monster> monster_map;

    //通过普通代码块进行初始化
    {
        monster_map=new HashMap<>();
        monster_map.put("monster03",new Monster(300,"猪八戒","暴力拳头"));
        monster_map.put("monster04",new Monster(400,"孙悟空","魅惑术"));
    }

    //写一个方法返回monster对象
    public Monster getMonster(String key){
        return monster_map.get(key);
    }
}
