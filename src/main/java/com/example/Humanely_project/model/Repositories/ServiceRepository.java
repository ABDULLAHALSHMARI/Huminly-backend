package com.example.Humanely_project.model.Repositories;

import com.example.Humanely_project.model.Entities.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository <Services, Integer> {

}
