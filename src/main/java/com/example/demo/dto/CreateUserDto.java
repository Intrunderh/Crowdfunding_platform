package com.example.demo.dto;

import com.example.demo.model.UserHibernate;

import java.time.LocalDate;

public class CreateUserDto {

    public String name;
    public int age;
    public boolean sex;
    public String email;
//    public LocalDate currentTimeCreate пока не знаю точно добавлять или нет

    public CreateUserDto(String name, int age, boolean sex, String email)  {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public CreateUserDto createUserDto(UserHibernate userHibernate) {
        return new CreateUserDto(
                userHibernate.getName(),
                userHibernate.getAge(),
                userHibernate.isSex(),
                userHibernate.getEmail()
        );
    }

}
