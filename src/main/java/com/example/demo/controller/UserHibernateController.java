package com.example.demo.controller;

//import com.example.demo.service.UserHibernateService;
import com.example.demo.model.UserHibernate;
import com.example.demo.service.UserHibernateService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class UserHibernateController {

    @Autowired
    UserHibernateService userHibernateService;

    public UserHibernateController(UserHibernateService userHibernateService) {
        this.userHibernateService = userHibernateService;
    }

    @GetMapping("/users")
    public List<UserHibernate> getAllUsers() {
        return userHibernateService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserHibernate getUserById(long id) {
        return userHibernateService.getUserById(id);
    }

    @PostMapping("/users")
    public UserHibernate createUser(@RequestBody UserHibernate userHibernate) {
        return userHibernateService.createUser(userHibernate);
    }

    @PutMapping("/users/{id}")
    public UserHibernate updateUser(long id, @RequestBody UserHibernate userHibernate) {
        return userHibernateService.updateUser(userHibernate);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(long id) {
        userHibernateService.deleteUser(id);
    }

    @DeleteMapping("/users")
    public void deleteAllUsers() {
        userHibernateService.deleteAllUsers();
    }

//    @GetMapping("/users/sex")
//    public List<UserHibernate> findByGender() {
//        return userHibernateService.findByGender();
//    }
}