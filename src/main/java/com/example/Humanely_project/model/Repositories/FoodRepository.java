package com.example.Humanely_project.model.Repositories;

import com.example.Humanely_project.model.Entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
}

