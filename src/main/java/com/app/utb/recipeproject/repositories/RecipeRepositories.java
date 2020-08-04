package com.app.utb.recipeproject.repositories;

import com.app.utb.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepositories extends CrudRepository<Recipe, Long> {
}
