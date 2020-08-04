package com.app.utb.recipeproject.repositories;

import com.app.utb.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
