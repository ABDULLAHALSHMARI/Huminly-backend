package com.example.Humanely_project.model.Services;
import com.example.Humanely_project.model.Entities.Food;
import com.example.Humanely_project.model.Repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FoodService {
    private FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getFood() {
        return foodRepository.findAll();
    }
    public Optional<Food>getFood(Integer foodId ){
        return foodRepository.findById(foodId);
    }
    public void addNewFood(Food food){
        foodRepository.save(food);
    }

    public void deleteUsers(Integer foodId) {
        foodRepository.deleteById(foodId);
    }


}