package com.example.Humanely_project.model.Services;

import com.example.Humanely_project.model.Entities.Users;
import com.example.Humanely_project.model.Repositories.UserRepository;
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

class UserServiceTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUsers() {
        List<Users> result = userService.getUsers();
        Assertions.assertEquals(Arrays.<Users>asList(new Users(0, "username", "email", 0)), result);
    }

    @Test
    void testGetUser() {
        Optional<Users> result = userService.getUser(Integer.valueOf(0));
        Assertions.assertEquals(Optional.empty(), result);
    }

    @Test
    void testGetCheck() {
        when(userRepository.findPasswordByUsername(anyString())).thenReturn("findPasswordByUsernameResponse");
        when(userRepository.existsByUsername(anyString())).thenReturn(Boolean.TRUE);

        String result = userService.getCheck("username", "password");
        Assertions.assertEquals("Password does not match", result);
    }

    @Test
    void testAddNewUsers() {
        userService.addNewUsers(new Users(0, "username", "email", 0));
    }

    @Test
    void testDeleteUsers() {
        userService.deleteUsers(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme