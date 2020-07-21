package com.driver;

import com.config.Config;
import com.repo.DaoRepo;
import com.service.DaoRepoImpli;
import com.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
        EmpService bean=ac.getBean("empService", EmpService.class);
        bean.ser();
//        DaoRepoImpli bean1=ac.getBean("daoRepoImpli", DaoRepoImpli.class);
//        bean1.method();



    }
}
