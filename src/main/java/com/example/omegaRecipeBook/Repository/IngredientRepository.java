package com.example.omegaRecipeBook.Repository;

import com.example.omegaRecipeBook.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
