package com.example.demo.readmodel;

import com.example.demo.model.UserHibernate;

public class ProjectReadModel {

    int id;
//    UserHibernate userHibernate;
    String projectName;
    int percent;
    boolean status;

    public ProjectReadModel(int id, String projectName, int percent, boolean status) {
        this.id = id;
//        this.userHibernate = userHibernate;
        this.projectName = projectName;
        this.percent = percent;
        this.status = status;
    }
}
