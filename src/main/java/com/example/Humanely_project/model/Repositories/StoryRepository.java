package com.example.Humanely_project.model.Repositories;

import com.example.Humanely_project.model.Entities.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  StoryRepository extends JpaRepository <Story,Integer> {
}
