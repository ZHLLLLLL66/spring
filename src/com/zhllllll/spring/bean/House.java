package com.zhllllll.spring.bean;

public class House {

    private String name;

    private void init() {
        System.out.println("这是init()方法");
    }

    private void destroy() {
        System.out.println("这是destory()方法");
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                '}';
    }

    public House() {
        System.out.println("这是House()构造器");
    }

    public void setName(String name) {
        this.name=name;
        System.out.println("这是set方法");
    }
}
