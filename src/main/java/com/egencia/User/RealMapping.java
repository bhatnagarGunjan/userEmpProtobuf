package com.egencia.User;

import com.egencia.Employee.EmpInfo;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RealMapping {
    @Autowired
    private  PopulateInfo populateInfo;
    @Autowired
   private MapperFactory mapperFactory;
  //  private ApplicationContext context;


    public EmpInfo mapEmpInfo(){
        return mapperFactory.getMapperFacade().map(this.populateInfo.addUserInfo(),EmpInfo.class);
    }

    public UserInfo mapUserInfo(){
        return  mapperFactory.getMapperFacade().map(this.populateInfo.addEmpInfo(),UserInfo.class);
    }

}
