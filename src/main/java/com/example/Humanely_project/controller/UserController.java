package com.example.Humanely_project.controller;
import com.example.Humanely_project.model.Entities.Users;
import com.example.Humanely_project.model.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/user")
public class UserController {

    private UserService userService;

    @Autowired

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<Users> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("add")
    public void registerNewUser(@RequestBody Users users) {
        userService.addNewUsers(users);
    }

    @GetMapping(path = "{usersId}")
    public Optional<Users> getUser(@PathVariable (name = "usersId") Integer usersId) {
        return userService.getUser(usersId);
    }

    @GetMapping(path = "login")
    public String checkLogin(@RequestParam (name = "username") String username ,
                             @RequestParam (name = "password") String password ) {
        return userService.getCheck(username,password);

    }
        @DeleteMapping(path = "delete/{usersId}")
        public void deleteUsers (@PathVariable("usersId") Integer usersId){
            userService.deleteUsers(usersId);
        }
}