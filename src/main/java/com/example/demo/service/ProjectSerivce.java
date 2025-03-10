package com.example.demo.service;

import com.example.demo.dto.CreateProjectDto;
import com.example.demo.dto.UpdateProjectDto;
import com.example.demo.model.Project;
import com.example.demo.readmodel.ProjectReadModel;
import com.example.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProjectSerivce {


    private final ProjectRepository projectRepository;
    private final ProjectReadModelFactory projectReadModelFactory;

    @Autowired
    public ProjectSerivce(ProjectRepository projectRepository, ProjectReadModelFactory projectReadModelFactory) {
        this.projectRepository = projectRepository;
        this.projectReadModelFactory = projectReadModelFactory;
    }

    public List<ProjectReadModel> getAllProject(){
        return projectRepository.findAll().stream()
                .map(project -> projectReadModelFactory.createByProject(project)).toList();
    }

    public ProjectReadModel getProjectById(Long id){
        Project project = projectRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return projectReadModelFactory.createByProject(project);
    }

    public CreateProjectDto createProject(CreateProjectDto createProjectDto) {
        return new CreateProjectDto(
                createProjectDto.projectName,
                createProjectDto.percent,
                createProjectDto.status
        );
    }

    public void updateUser(long id, UpdateProjectDto updateProjectDto){
        Project project = projectRepository.getById(id);
        project.setName(updateProjectDto.projectName);
        project.setPercent(updateProjectDto.percent);
        projectRepository.save(project);
    }

    public void deleteProject(long id){
        projectRepository.deleteById(id);
    }

    public void deleteAllUsers(){
        projectRepository.deleteAll();
    }

    public List<ProjectReadModel> findByStatus() {
        return projectRepository.findByStatus(true).stream()
                .map(project -> projectReadModelFactory.createByProject(project)).toList();
    }




}
