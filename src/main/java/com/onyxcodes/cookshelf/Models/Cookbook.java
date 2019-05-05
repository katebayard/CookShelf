package com.onyxcodes.cookshelf.Models;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cookbook {

    private Long id;
    private Long isbn;
    @NonNull
    private String cookbookName;
    private String authorFirstName;
    @NonNull
    private String authorLastName;
    private List<Recipe> recipeList;

    public Cookbook() {
        this.recipeList = new ArrayList<>();
    }

    public Cookbook(@NonNull String cookbookName, @NonNull String authorLastName) {
        this.cookbookName = cookbookName;
        this.authorLastName = authorLastName;
        this.recipeList = new ArrayList<>();
    }

    public Cookbook(Long isbn, String cookbookName, String authorFirstName, String authorLastName) {
        this.isbn = isbn;
        this.cookbookName = cookbookName;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.recipeList = new ArrayList<>();
    }

    public Cookbook(Long isbn, @NonNull String cookbookName, String authorFirstName, @NonNull String authorLastName, List<Recipe> recipeList) {
        this.isbn = isbn;
        this.cookbookName = cookbookName;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.recipeList = recipeList;
    }

    public void addRecipe(Recipe newRecipe){
        recipeList.add(newRecipe);
    }

    public void removeRecipe(Recipe recipeToRemove) {
        recipeList.remove(recipeToRemove);
    }
}
