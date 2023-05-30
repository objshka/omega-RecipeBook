package com.example.omegaRecipeBook.Repository;

import com.example.omegaRecipeBook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
