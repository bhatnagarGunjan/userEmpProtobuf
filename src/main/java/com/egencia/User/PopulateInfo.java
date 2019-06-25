package com.egencia.User;

import UsrStruct.UserStruct;
import com.egencia.Employee.EmpInfo;
import com.egencia.Employee.Salary;
import com.egencia.Employee.Tech;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class PopulateInfo {
@Autowired
    private EmpInfo empInfo;
@Autowired
    private Salary salary;
@Autowired
    private Tech tech;

//    @Autowired
//    public PopulateInfo(EmpInfo empInfo, Salary salary) {
//        this.empInfo = empInfo;
//        this.salary = salary;
//    }

    public UserStruct.User addUserInfo(){
        UserStruct.User.Builder userBuilder = UserStruct.User.newBuilder();
        userBuilder.setName("Gunjan");
        userBuilder.setAge(21);
        userBuilder.setSalary(20000);
        userBuilder.addAllTech(Arrays.asList("BigData","BlockChain"));
        UserStruct.User builtUser = userBuilder.build();
        return builtUser;
    }

    public EmpInfo addEmpInfo() {
        empInfo.setName("Divya");
        empInfo.setAge(21);
        salary.setSalary(40000);
        empInfo.setSalary(salary);
        tech.setTech(Arrays.asList("dj"));
        return empInfo;
    }

}

