package com.example.omegaRecipeBook.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "ingredients")
@Data
@NoArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "block_name")
    private String title;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    public Ingredient(String title, String content, Recipe recipe) {
        this.title = title;
        this.content = content;
        this.recipe = recipe;
    }
}
