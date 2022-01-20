package com.example.Humanely_project.model.Entities;

import javax.persistence.*;

@Table
@Entity
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String title;
    private String img;
    private String size;

    public Clothes(int id, String name, String title, String img, String size) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.img = img;
        this.size = size;
    }
    @OneToOne
    @JoinColumn(name = "servicesId", unique = true)
    private Services serviceCloth;

    public Clothes() {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
