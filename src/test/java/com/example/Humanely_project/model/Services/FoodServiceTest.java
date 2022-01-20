package com.example.Humanely_project.model.Services;

import com.example.Humanely_project.model.Entities.Food;
import com.example.Humanely_project.model.Entities.Services;
import com.example.Humanely_project.model.Entities.Users;
import com.example.Humanely_project.model.Repositories.FoodRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class FoodServiceTest {
    @Mock
    FoodRepository foodRepository;
    @InjectMocks
    FoodService foodService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetFood() {
        List<Food> result = foodService.getFood();
        Assertions.assertEquals(Arrays.<Food>asList(new Food(0, "name", "title", "img", "expired", new Services(0, "name", "title", "date", "location", Arrays.<Users>asList(new Users(0, "username", "email", 0))))), result);
    }

    @Test
    void testGetFood2() {
        Optional<Food> result = foodService.getFood(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewFood() {
        foodService.addNewFood(new Food(0, "name", "title", "img", "expired", new Services(0, "name", "title", "date", "location", Arrays.<Users>asList(new Users(0, "username", "email", 0)))));
    }

    @Test
    void testDeleteUsers() {
        foodService.deleteUsers(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme