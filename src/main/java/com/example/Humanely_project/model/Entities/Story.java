package com.example.Humanely_project.model.Entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String time;

    @OneToOne
    @JoinColumn(name = "servicesId", unique = true)
    private Services servicesStory;


    public Story(Integer id, String time, Services servicesStory) {
        this.id = id;
        this.time = time;
        this.servicesStory = servicesStory;
    }

    public Story() {
    }

    public Services getServicesStory() {
        return servicesStory;
    }

    public void setServicesStory(Services servicesStory) {
        this.servicesStory = servicesStory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", time='" + time + '\'' +
                '}';
    }
}
