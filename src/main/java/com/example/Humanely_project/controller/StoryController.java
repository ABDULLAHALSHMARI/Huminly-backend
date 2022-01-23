package com.example.Humanely_project.controller;

import com.example.Humanely_project.model.Entities.Food;
import com.example.Humanely_project.model.Entities.Story;
import com.example.Humanely_project.model.Services.FoodService;
import com.example.Humanely_project.model.Services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://humanlyhelp.herokuapp.com")
@RestController
@RequestMapping("api/Story")
public class StoryController {
    private StoryService storyService;

    @Autowired

    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    public StoryService getStoryService() {
        return storyService;
    }

    public void setStoryService(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping
    public List<Story> getStory() {
        return storyService.getStory();
    }

    @PostMapping("add")
    public void registerNewStory(@RequestBody Story story) {
        storyService.addNewStory(story);
    }

    @GetMapping(path = "{storyId}")
    public Optional<Story> getStory(@PathVariable (name = "storyId") Integer storyId) {
        return storyService.getStory (storyId);
    }
//
//    @DeleteMapping(path = "delete/{foodId}")
//    public void deleteFood (@PathVariable("foodId") Integer foodId){
//        foodService.deleteUsers(foodId);
//    }
}
