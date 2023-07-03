package com.example.omegaRecipeBook.Repository;

import com.example.omegaRecipeBook.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
