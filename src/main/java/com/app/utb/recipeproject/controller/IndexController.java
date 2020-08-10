package com.app.utb.recipeproject.controller;

import com.app.utb.recipeproject.domain.Category;
import com.app.utb.recipeproject.domain.UnitOfMeasure;
import com.app.utb.recipeproject.repositories.CategoryRepository;
import com.app.utb.recipeproject.repositories.RecipeRepository;
import com.app.utb.recipeproject.repositories.UnitOfMeasureRepository;
import com.app.utb.recipeproject.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {


    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){

        log.debug("Getting Index Page");
        model.addAttribute("recipes", recipeService.getRecipes());
          return "index";
    }



}
