//package com.egencia.User;
//
//import com.egencia.Employee.EmpInfo;
//import com.egencia.Employee.Salary;
//import ma.glasnost.orika.CustomConverter;
//import ma.glasnost.orika.MappingContext;
//import ma.glasnost.orika.ObjectFactory;
//import ma.glasnost.orika.metadata.Type;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SalaryToDoubleConverter extends CustomConverter<Salary,Double> {
//    @Override
//    public Double convert(Salary source, Type<? extends Double> destinationType, MappingContext mappingContext) {
//        Salary salary=new Salary();
//        return salary.getSalary();
//    }
//}
