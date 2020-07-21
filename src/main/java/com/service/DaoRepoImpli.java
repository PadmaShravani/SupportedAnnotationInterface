package com.service;

import com.repo.DaoRepo;
import org.springframework.stereotype.Component;

@Component
public class DaoRepoImpli implements DaoRepo {
    public void method(){
        System.out.println("From Dao implimentation class");
    }
}
