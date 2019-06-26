package com.egencia.User;

import com.egencia.Employee.EmpInfo;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RealMapping {
    @Autowired
    private  PopulateInfo populateInfo;
    //private MapperFactory mapperFactory;
    @Autowired
    private MapperConf mapperConf;

//    @Autowired
//    public RealMapping(PopulateInfo populateInfo, MapperFactory mapperFactory, MapperConf mapperConf) {
//        this.populateInfo = populateInfo;
//        this.mapperFactory = mapperFactory;
//        this.mapperConf = mapperConf;
//    }




    public EmpInfo mapEmpInfo(){

        return mapperConf.map(this.populateInfo.addUserInfo(),EmpInfo.class);
    }

    public UserInfo mapUserInfo(){
        return  mapperConf.map(this.populateInfo.addEmpInfo(),UserInfo.class);
    }

}
