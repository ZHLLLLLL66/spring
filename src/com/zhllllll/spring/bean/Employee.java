package com.zhllllll.spring.bean;

public class Employee {

    private  String name;
    private  Dept dept;

    public Employee(String name, Dept dept) {
        this.name = name;
        this.dept = dept;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
