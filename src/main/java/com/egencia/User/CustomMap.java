//package com.egencia.User;
//
//import UsrStruct.UserStruct;
//import com.egencia.Employee.EmpInfo;
//import com.egencia.Employee.Salary;
//import ma.glasnost.orika.CustomMapper;
//import ma.glasnost.orika.MapperFacade;
//import ma.glasnost.orika.MapperFactory;
//import ma.glasnost.orika.MappingContext;
//import ma.glasnost.orika.impl.generator.specification.Convert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CustomMap extends CustomMapper<UserStruct.User.Builder, EmpInfo> {
//
//    //@Autowired
//    private MapperFacade mapperFacade;
//    @Autowired
//    private MyConverter myConverter;
//    @Autowired
//    private Salary salary;
//
//    @Override
//    public void mapAtoB(UserStruct.User.Builder userInfo, EmpInfo empInfo, MappingContext context) {
//        empInfo.setName(userInfo.getName());
//        empInfo.setAge(userInfo.getAge());
//        empInfo.setSalary(myConverter.convert(userInfo.getSalary(),salary));
//        //Salary sal =new Salary();
////        sal.setSalary(userInfo.getSalary());
////        empInfo.setSalary(sal);
//    }
//
//    @Override
//    public void mapBtoA(EmpInfo empInfo, UserStruct.User.Builder userInfo, MappingContext context) {
//        userInfo.setName(empInfo.getName());
//        userInfo.setAge(empInfo.getAge());
//       // userInfo.setSalary(myConverter.convert(userInfo.getSalary(),empInfo.getSalary()));
//        //userInfo.setSalary(empInfo.getSalary().getSalary());
//    }
//
//}
//
