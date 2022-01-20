package com.example.Humanely_project.model.Entities;

import javax.persistence.*;

@Entity
@Table
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String title;
    private String img;
    private String expired;

    @OneToOne
    @JoinColumn(name = "servicesId", unique = true)
    private Services service;

    public Food(int id, String name, String title, String img, String expired, Services service) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.img = img;
        this.expired = expired;
        this.service = service;
    }

    public Food() {
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", expired='" + expired + '\'' +
                '}';
    }
}