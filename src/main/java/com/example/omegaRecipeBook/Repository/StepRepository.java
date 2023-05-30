package com.example.omegaRecipeBook.Repository;

import com.example.omegaRecipeBook.model.Step;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepRepository extends JpaRepository<Step, Long> {
}
