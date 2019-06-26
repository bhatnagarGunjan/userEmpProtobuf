package com.egencia.Employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Tech {
    private ArrayList<String> Tech;

    public ArrayList<String> getTech() {
        return Tech;
    }

    public void setTech() {
        this.Tech = new ArrayList<>();
    }

    public void addElement(String element){
        this.Tech.add(element);
    }
}
