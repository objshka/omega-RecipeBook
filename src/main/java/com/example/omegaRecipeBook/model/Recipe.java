package com.example.omegaRecipeBook.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "recipes")
@Data
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "cooking_time")
    private int cookingTime;

    @Column(name = "serving_number")
    private int servingNumber;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Ingredient> ingredientList;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Step> stepList;

    @ManyToMany(mappedBy = "likedRecipes")
    private List<User> likedByUsers;

    @ManyToMany(mappedBy = "recipeTags")
    private List<Tag> tags;

    public Recipe(String title, String description, int cookingTime, int servingNumber, String image) {
        this.title = title;
        this.description = description;
        this.cookingTime = cookingTime;
        this.servingNumber = servingNumber;
        this.image = image;
    }
}
