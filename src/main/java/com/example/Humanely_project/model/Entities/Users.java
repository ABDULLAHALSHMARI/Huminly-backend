package com.example.Humanely_project.model.Entities;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
//import javax.persistence.Id;

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String username; 
    private String Email;
    private int password;

    @ManyToMany(mappedBy = "usersMul")
    private List<Services> servicesMul = new ArrayList<>();

    public Users(int id, String username, String email, int password) {
        this.id = id;
        this.username = username;
        this.Email = email;
        this.password = password;
    }

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", Email='" + Email + '\'' +
                ", password=" + password +
                '}';
    }
}
