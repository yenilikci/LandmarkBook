package com.example.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String country;
    String description;
    int image;

    public Landmark(String name, String country, String description, int image) {
        this.name = name;
        this.country = country;
        this.description = description;
        this.image = image;
    }
}
