package com.app.utb.recipeproject.services;

import com.app.utb.recipeproject.domain.Recipe;
import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
