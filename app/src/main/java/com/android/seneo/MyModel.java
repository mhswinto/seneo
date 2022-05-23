package com.android.seneo;

public class MyModel {

    String title, description, resource;
    int image;

    public MyModel(String title, String description, String resource, int image) {
        this.title = title;
        this.description = description;
        this.resource = resource;
        this.image = image;
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

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
