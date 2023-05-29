package com.example.omegaRecipeBook.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_recipe_likes")
@Data
@NoArgsConstructor
public class UserRecipeLike { //это была одной из моих идей как связать пользователей и рецепты для лайков
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @Column(name = "like_status")
    private boolean likeStatus;
}
