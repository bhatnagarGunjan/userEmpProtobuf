package com.egencia.Employee;

import org.springframework.stereotype.Component;

@Component
public class Salary {
    private Double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
