package com.example.Humanely_project.model.Repositories;

import com.example.Humanely_project.model.Entities.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothesRepository extends JpaRepository<Clothes,Integer> {
}
