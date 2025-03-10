package com.example.demo.dto;

import com.example.demo.model.Project;

public class CreateProjectDto {

//    Убрал id project и userHibernate, чтобы айдишки не высвечивались

    public String projectName;
    public int percent;
    public boolean status;

    public CreateProjectDto(String projectName, int percent, boolean status) {
        this.projectName = projectName;
        this.percent = percent;
        this.status = status;
    }

    public CreateProjectDto createProjectDto(Project project) {
        return new CreateProjectDto(
                project.getName(),
                project.getPercent(),
                project.isStatus()
        );
    }
}
