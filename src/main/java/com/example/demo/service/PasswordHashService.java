package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PasswordHashService {

    public String hash(String password){
        return password;
    }

}
