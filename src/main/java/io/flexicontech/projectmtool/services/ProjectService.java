/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.flexicontech.projectmtool.services;

import io.flexicontech.projectmtool.domain.Project;
import io.flexicontech.projectmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omoefe
 */
@Service
public class ProjectService {
    
    @Autowired
    private ProjectRepository projectRepository;
    
    public Project saveOrUpdateProject(Project project){
      return projectRepository.save(project);
    }
}
