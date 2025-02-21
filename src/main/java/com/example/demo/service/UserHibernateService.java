package com.example.demo.service;

import com.example.demo.model.UserHibernate;
import com.example.demo.repository.UserHibernateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserHibernateService {

    UserHibernateRepository userHibernateRepository;

    @Autowired
    public UserHibernateService(UserHibernateRepository userHibernateRepository) {
        this.userHibernateRepository = userHibernateRepository;
    }


    public List<UserHibernate> getAllUsers() {
        return userHibernateRepository.findAll();
    }

    public UserHibernate getUserById(long id) {
        return userHibernateRepository.findById(id).orElseThrow(NoSuchElementException::new);

    }

    public UserHibernate createUser(UserHibernate userHibernate) {
        return userHibernateRepository.save(userHibernate);
    }

    public UserHibernate updateUser(UserHibernate userHibernate) {
        return userHibernateRepository.save(userHibernate);
    }

    public void deleteUser(long id) {
        userHibernateRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        userHibernateRepository.deleteAll();
    }

//    public List<UserHibernate> findByGender() {
//        return userHibernateRepository.finn(true);
//    }
}
