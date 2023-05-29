package com.example.omegaRecipeBook.model;

public class Recipe {
    private Long id;
    private String title;
    private String description;
    private int cookingTime;
    private int servingNumber;
    private String image;

    public Recipe() {
    }

    public Recipe(String title, String description, int cookingTime, int servingNumber, String image) {
        this.title = title;
        this.description = description;
        this.cookingTime = cookingTime;
        this.servingNumber = servingNumber;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getServingNumber() {
        return servingNumber;
    }

    public void setServingNumber(int servingNumber) {
        this.servingNumber = servingNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
