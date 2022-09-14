package com.zhllllll.spring.bean;

public class Test4 {
    private  String test;
    private  boolean flag;
    private  Integer id;

    @Override
    public String toString() {
        return "Test2{" +
                "test='" + test + '\'' +
                ", flag=" + flag +
                ", id=" + id +
                '}';
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Test4(String test, boolean flag, Integer id) {
        this.test = test;
        this.flag = flag;
        this.id = id;
    }
}
