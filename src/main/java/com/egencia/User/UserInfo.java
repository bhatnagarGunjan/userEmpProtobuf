package com.egencia.User;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserInfo {
    private String name;
    private Integer age;
    private Double salary;
    private ArrayList<String> tech;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public ArrayList<String> getTech() {
        return tech;
    }

    public void setTech(ArrayList<String> tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", tech=" + tech +
                '}';
    }
}
