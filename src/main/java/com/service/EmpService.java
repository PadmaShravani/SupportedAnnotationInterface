package com.service;

import com.repo.DaoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmpService {
    @Autowired
   // @Qualifier("daoRepoImpli")
    private DaoRepo dao;

    public void ser(){
        dao.method();
        System.out.println("From Employee Service");
    }
}
