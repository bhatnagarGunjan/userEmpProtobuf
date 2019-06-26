package com.egencia.Employee;

import org.springframework.stereotype.Component;

@Component
public class EmpInfo {
    private String name;
    private int age;
    public Salary salary;
    private Tech tech;

//
//    public EmpInfo(String name, int age, Salary salary, Tech tech) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.tech = tech;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Tech getTech() {
        return tech;
    }

    public void setTech(Tech tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary="  + salary+
                ", tech=" + tech +
                '}';
    }
}
