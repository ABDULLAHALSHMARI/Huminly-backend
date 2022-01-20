package com.example.Humanely_project.model.Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")

public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String title;
    private String date;
    private String location;

    @ManyToMany
    @JoinTable(name = "User_services",
            joinColumns = @JoinColumn(name="Users_id"),
            inverseJoinColumns = @JoinColumn(name = "Services_id"))
    private List<Users> usersMul = new ArrayList<>();

    @OneToOne(mappedBy = "service")
    @JsonIgnore
    private Food food;

    @OneToOne(mappedBy = "servicesStory")
    @JsonIgnore
    private Story story;

    @OneToOne(mappedBy = "serviceCloth")
    @JsonIgnore
    private Clothes clothes;

    @OneToOne(mappedBy = "serviceEle")
    @JsonIgnore
    private ElectricDev electricDev;


    public Services(int id, String name, String title, String date, String location, List<Users> usersMul) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.date = date;
        this.location = location;
        this.usersMul = usersMul;
    }

    public Services() {
    }

    public int getId() {
        return id;
    }

    public List<Users> getUsersMul() {
        return usersMul;
    }

    public void setUsersMul(List<Users> usersMul) {
        this.usersMul = usersMul;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
