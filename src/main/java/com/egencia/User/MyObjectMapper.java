package com.egencia.User;

import UsrStruct.UserStruct;
import com.egencia.Employee.EmpInfo;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.ObjectFactory;

public class MyObjectMapper implements ObjectFactory<UserStruct.User.Builder> {
    @Override
    public UserStruct.User.Builder create(Object source, MappingContext mappingContext) {
        EmpInfo empInfo= (EmpInfo) source;
        UserStruct.User.Builder userBuilder= UserStruct.User.newBuilder();
        userBuilder.setName(empInfo.getName());
        userBuilder.setAge(empInfo.getAge());
        userBuilder.setSalary(empInfo.salary.getSalary());
        userBuilder.build();
        return userBuilder;

    }
}
