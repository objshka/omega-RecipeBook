package com.example.omegaRecipeBook.Repository;

import com.example.omegaRecipeBook.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
