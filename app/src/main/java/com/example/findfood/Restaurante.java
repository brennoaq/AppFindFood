package com.example.findfood;

import java.io.Serializable;

public class Restaurante implements Serializable {

    private String title;
    private String description;
    private String image;
    private String colorName;
    private String colorBackground;
    private String latitude;
    private String longitude;
    private String id;

    public Restaurante() {
    }

    public Restaurante(String title, String description, String image, String colorName, String colorBackground, String latitude, String longitude, String id) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.colorName = colorName;
        this.colorBackground = colorBackground;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorBackground() {
        return colorBackground;
    }

    public void setColorBackground(String colorBackground) {
        this.colorBackground = colorBackground;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
