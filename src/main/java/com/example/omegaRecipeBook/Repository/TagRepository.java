package com.example.omegaRecipeBook.Repository;

import com.example.omegaRecipeBook.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
