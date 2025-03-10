package com.example.demo.dto;

import com.example.demo.model.Project;

public class UpdateProjectDto {

    public String projectName;
    public int percent;

    // при апдейте не должен меняться статус, так как он будет меняться автоматически


    public UpdateProjectDto(String projectName, int percent) {
        this.projectName = projectName;
        this.percent = percent;
    }

    public UpdateProjectDto updateProjectDto(Project project){
        return new UpdateProjectDto(
                project.getName(),
                project.getPercent()
        );
    }
}
