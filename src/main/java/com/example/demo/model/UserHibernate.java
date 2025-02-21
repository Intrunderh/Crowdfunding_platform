package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserHibernate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String name;


    @Column(name = "age")
    private String age;


    @Column(name = "sex")
    private boolean sex;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
