package com.zhllllll.spring.bean;

/**
 * @author zhllllll
 * @version 1.0
 * Javabean/Entity
 */
public class Monster {
 private  Integer monsterId;
 private  String name;
 private  String skill;

    public Monster(Integer monsterId, String name, String skill) {
        this.monsterId = monsterId;
        this.name = name;
        this.skill = skill;
    }

    //无参构造器
    public Monster() {
    }

    public Integer getMonsterId() {
        return monsterId;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public void setMonsterId(Integer monsterId) {
        this.monsterId = monsterId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterId=" + monsterId +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
