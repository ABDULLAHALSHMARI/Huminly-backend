package com.example.Humanely_project.model.Services;
import com.example.Humanely_project.model.Entities.Users;
import com.example.Humanely_project.model.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    public Optional<Users>getUser(Integer usersId ){
        return userRepository.findById(usersId);
    }

    public String getCheck(String username ,String password) {
        if( userRepository.existsByUsername(username) ){
            String pass = userRepository.findPasswordByUsername(username);
            if (pass.equals(password)){
                return "authenticated" ;
            }
            else {
                return "Password does not match"; }
        }

        return "Username not found";
    }

    public void addNewUsers(Users users){
        userRepository.save(users);
    }

    public void deleteUsers(Integer usersId) {
        userRepository.deleteById(usersId);
    }

}