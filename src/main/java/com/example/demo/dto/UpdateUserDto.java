package com.example.demo.dto;

import com.example.demo.model.UserHibernate;

public class UpdateUserDto {

    public String name;
    public int age;
    public boolean sex;

    // при апдейте почта не должна обновляться

    public UpdateUserDto(String name, int age, boolean sex) throws Exception {
        if (name.length() < 3) {
            throw new Exception("Ошибка обновления. Имя пользователя меньше 3 символов");
        } else {
            this.name = name;
        }
        if (age < 14) {
            throw new Exception("Ошибка обновления. Пользователь младше 14 лет");
        } else {
            this.age = age;
        }
        this.sex = sex;
    }

    public UpdateUserDto updateUserDto(UserHibernate userHibernate) throws Exception {
        return new UpdateUserDto(
                userHibernate.getName(),
                userHibernate.getAge(),
                userHibernate.isSex()
        );
    }
}

