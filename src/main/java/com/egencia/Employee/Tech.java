package com.egencia.Employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Tech {
    private ArrayList<String> Tech;

    public ArrayList<String> getTech() {
        return Tech;
    }

    public void setTech(ArrayList<String> tech) {
        for(String tech1 : tech)
        this.Tech.add(tech1);
    }
}
