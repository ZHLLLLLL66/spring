package com.zhllllll.spring.bean;

import java.util.*;

public class Master {
    private String name; //主人名
    private List<Monster> monsterList;
    private Map<String, Monster> monsterMap;
    private Set<Monster> monsterSet;

    //数组
    private String[] monsterName;

    //java基础
    //这个Properties 是Hashtable的子类 ， 是key-value的形式
    //这里Properties  kry和value 都是 String
    private Properties pros;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Monster> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(List<Monster> monsterList) {
        this.monsterList = monsterList;
    }

    public Map<String, Monster> getMonsterMap() {
        return monsterMap;
    }

    public void setMonsterMap(Map<String, Monster> monsterMap) {
        this.monsterMap = monsterMap;
    }

    public Set<Monster> getMonsterSet() {
        return monsterSet;
    }

    public void setMonsterSet(Set<Monster> monsterSet) {
        this.monsterSet = monsterSet;
    }

    public String[] getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String[] monsterName) {
        this.monsterName = monsterName;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    public Master() {
    }

    public Master(String name, List<Monster> monsterList, Map<String, Monster> monsterMap, Set<Monster> monsterSet, String[] monsterName, Properties pros) {
        this.name = name;
        this.monsterList = monsterList;
        this.monsterMap = monsterMap;
        this.monsterSet = monsterSet;
        this.monsterName = monsterName;
        this.pros = pros;
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", monsterList=" + monsterList +
                ", monsterMap=" + monsterMap +
                ", monsterSet=" + monsterSet +
                ", monsterName=" + Arrays.toString(monsterName) +
                ", pros=" + pros +
                '}';
    }
}
