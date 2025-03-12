package com.example.demo.controller;

import com.example.demo.dto.CreateUserDto;
import com.example.demo.dto.UpdateUserDto;
import com.example.demo.readmodel.UserReadModel;
import com.example.demo.service.UserHibernateService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<UserReadModel> getAllUsers() {
        return userHibernateService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserReadModel getUserById(long id) {
        return userHibernateService.getUserById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@Valid @RequestBody CreateUserDto createUserDto) throws Exception {
        try {
            int id  = userHibernateService.createUser(createUserDto);
            return new ResponseEntity<>(String.valueOf(id), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping("/users/{id}")
    public void updateUser(long id, @RequestBody UpdateUserDto updateUserDto) {
        userHibernateService.updateUser(id, updateUserDto);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(long id) {
        userHibernateService.deleteUser(id);
    }

    @DeleteMapping("/users")
    public void deleteAllUsers() {
        userHibernateService.deleteAllUsers();
    }

    @GetMapping("/users/sex")
    public List<UserReadModel> findByGender() {
        return userHibernateService.findByGender();
    }

    @GetMapping("/users/email")
    public List<UserReadModel> findByEmailAddress(String email) {
        return userHibernateService.findByEmailAddress(email);
    }

}