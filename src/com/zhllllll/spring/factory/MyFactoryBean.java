package com.zhllllll.spring.factory;

import com.zhllllll.spring.bean.Monster;
import org.springframework.beans.factory.FactoryBean;

import java.util.HashMap;
import java.util.Map;

/*
 * 是一个FactoryBean
 * */
public class MyFactoryBean implements FactoryBean<Monster> {

    public void setKey(String key) {
        this.key = key;
    }

    //这个就是你配置的时候，指定要获取的对象对应的key
    private String key;
    private Map<String, Monster> monster_map;

    {//代码块，完成初始化
        monster_map = new HashMap<>();
        monster_map.put("monster05", new Monster(500,"黄大仙","烟雾弹"));
        monster_map.put("monster06", new Monster(600,"绿大仙","绿烟雾弹"));
    }

    @Override
    public Monster getObject() throws Exception {
        return monster_map.get(key);
    }

    @Override
    public Class<?> getObjectType() {
        return Monster.class;
    }

    //是否返回是单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
