package com.example.demo.service;

import com.example.demo.model.Project;
import com.example.demo.readmodel.ProjectReadModel;
import org.springframework.stereotype.Service;

@Service
public class ProjectReadModelFactory {

    public ProjectReadModel createByProject(Project project) {
        return new ProjectReadModel(
                project.getId(),
//                project.getUserHibernate(),
                project.getName(),
                project.getPercent(),
                project.isStatus()
        );
    }

}
