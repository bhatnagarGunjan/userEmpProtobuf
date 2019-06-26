package com.egencia.User;

import com.egencia.Employee.EmpInfo;
import com.egencia.Employee.Salary;
import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

@Component
public class MyConverter extends CustomConverter<Double, Salary> {


    @Override
    public Salary convert(Double source, Type<? extends Salary> destinationType, MappingContext mappingContext) {
        Salary salary = new Salary();
        salary.setSalary(source);
        return salary;
    }
}





