package com.example.Humanely_project.model.Services;

import com.example.Humanely_project.model.Entities.ElectricDev;
import com.example.Humanely_project.model.Repositories.ElectricDevRepository;
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

class ElectricDevServiceTest {
    @Mock
    ElectricDevRepository electricDevRepository;
    @InjectMocks
    ElectricDevService electricDevService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetElectricDev() {
        List<ElectricDev> result = electricDevService.getElectricDev();
        Assertions.assertEquals(Arrays.<ElectricDev>asList(new ElectricDev
                (0, "name", "title", "img", "size")), result);
    }

    @Test
    void testGetElectricDev2() {
        Optional<ElectricDev> result = electricDevService.getElectricDev(Integer.valueOf(0));
        Assertions.assertEquals(Optional.empty(), result);
    }

    @Test
    void testAddNewElectricDev() {
        electricDevService.addNewElectricDev(new ElectricDev(0, "name", "title", "img", "size"));
    }

    @Test
    void testDeleteUsers() {
        electricDevService.deleteUsers(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme