package com.egencia;

import com.egencia.User.RealMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class UserMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(UserMain.class);
        //System.out.println("@@@@@@@@@@@@@@@@@@@@@@@       " +context);
        RealMapping rm = context.getBean(RealMapping.class);
      //  System.out.println("###############      RM  " +rm);
        System.out.println(rm.mapEmpInfo());
        System.out.println("\n\n\n\n");
        //System.out.println(rm.mapUserInfo());
       // System.out.println(rm.mapUserInfo());


    }

}
