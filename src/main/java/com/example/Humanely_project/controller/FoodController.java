package com.example.Humanely_project.controller;
import com.example.Humanely_project.model.Entities.Food;
import com.example.Humanely_project.model.Services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://humanlyhelp.herokuapp.com")
@RestController
@RequestMapping(path = "api/food")
public class FoodController {

    private FoodService foodService;

    @Autowired

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    public FoodService getFoodService() {
        return foodService;
    }

    public void setFoodService(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getFood() {
        return foodService.getFood();
    }

    @PostMapping("add")
    public void registerNewFood(@RequestBody Food food) {
        foodService.addNewFood(food);
    }

    @GetMapping(path = "{foodId}")
    public Optional<Food> getFood(@PathVariable (name = "foodId") Integer foodId) {
        return foodService.getFood (foodId);
    }

    @DeleteMapping(path = "delete/{foodId}")
    public void deleteFood (@PathVariable("foodId") Integer foodId){
        foodService.deleteUsers(foodId);
    }
}