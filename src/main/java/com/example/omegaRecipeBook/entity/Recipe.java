package com.example.omegaRecipeBook.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipe")
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
    private List<Ingredient> ingredientList = new ArrayList<>();

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Step> stepList = new ArrayList<>();

    @ManyToMany(mappedBy = "likedRecipes")
    private List<User> likedByUsers = new ArrayList<>();

    @ManyToMany(mappedBy = "recipeTags")
    private List<Tag> tags = new ArrayList<>();
}
