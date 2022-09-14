package com.zhllllll.spring.bean;

public class Test1 {
    private String name;
    private  Integer id;

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Test1(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
}
