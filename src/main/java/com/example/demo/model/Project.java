package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    // У каждого ProjectHibernate будет user{id}.
    // нужно убедиться, что user с таким id - есть
    // создание, обновление, удаление по id,
    // получение списка, но получение списка делаю по user{id}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int id;

//    @ManyToOne
//    @JoinColumn(name = "id", referencedColumnName = "id")
//    private UserHibernate userHibernate;

    @Column(name = "name")
    private String name;

    @Column(name = "collected")
    private int percent;

    @Column(name = "status")
    private boolean status;

//    public UserHibernate getUserHibernate() {
//        return userHibernate;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
