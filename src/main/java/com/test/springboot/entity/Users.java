package com.test.springboot.entity;

public class Users {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "姓名：'" + name + '\'' +
                ", 年龄：'" + age + '\'' +
                '}';
    }
}
