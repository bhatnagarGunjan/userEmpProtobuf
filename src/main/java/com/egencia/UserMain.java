package com.egencia;

import com.egencia.User.RealMapping;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserMain {

//
//    @Autowired
//    private MapperFactory mapperFactory;


    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(UserMain.class,args);

        RealMapping rm = context.getBean(RealMapping.class);
        System.out.println(rm.mapEmpInfo());


    }

}
