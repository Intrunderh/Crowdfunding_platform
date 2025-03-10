package com.example.demo.service;

import com.example.demo.readmodel.UserReadModel;
import com.example.demo.model.UserHibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserReadModelFactory {

    @Autowired
    private PasswordHashService passwordHashService;

    public UserReadModel createByUserHibernate(UserHibernate userHibernate){
         return new UserReadModel(
                 userHibernate.getId(),
                 userHibernate.getName(),
                 userHibernate.getAge(),
                 userHibernate.isSex()
         );
    }

}
