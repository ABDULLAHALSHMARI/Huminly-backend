package com.example.Humanely_project.model.Services;

import com.example.Humanely_project.model.Entities.Clothes;
import com.example.Humanely_project.model.Repositories.ClothesRepository;
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

class ClothesServiceTest {
    @Mock
    ClothesRepository clothesRepository;
    @InjectMocks
    ClothesService clothesService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetClothes() {
        List<Clothes> result = clothesService.getClothes();
        Assertions.assertEquals(Arrays.<Clothes>asList(new Clothes(0, "name", "title", "img", "size")), result);
    }

    @Test
    void testGetClothes2() {
        Optional<Clothes> result = clothesService.getClothes(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewClothes() {
        clothesService.addNewClothes(new Clothes(0, "name", "title", "img", "size"));
    }

    @Test
    void testDeleteUsers() {
        clothesService.deleteUsers(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme