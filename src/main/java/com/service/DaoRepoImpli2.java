package com.service;

import com.repo.DaoRepo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DaoRepoImpli2 implements DaoRepo {
    public void method(){
        System.out.println("From Dao implimentation 2 class");
    }
}
