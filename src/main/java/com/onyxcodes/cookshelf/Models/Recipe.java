package com.onyxcodes.cookshelf.Models;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Recipe {

    private Long id;
    private Cookbook cookbook;
    @NonNull
    private String recipeName;
    private Integer pageNumber;
    private List<Ingredient> ingredientList;

    public Recipe() {
        this.ingredientList = new ArrayList<>();
    }

    public Recipe(@NonNull String recipeName) {
        this.recipeName = recipeName;
        this.ingredientList = new ArrayList<>();
    }

    public Recipe(Cookbook cookbook, @NonNull String recipeName, Integer pageNumber) {
        this.cookbook = cookbook;
        this.recipeName = recipeName;
        this.pageNumber = pageNumber;
        this.ingredientList = new ArrayList<>();
    }

    public void addIngredient(Ingredient newIngredient) {
        ingredientList.add(newIngredient);
    }

    public void removeIngredient(Ingredient ingredientToRemove) {
        ingredientList.remove(ingredientToRemove);
    }
}
