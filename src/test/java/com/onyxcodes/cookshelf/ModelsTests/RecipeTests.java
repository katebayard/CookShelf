package com.onyxcodes.cookshelf.ModelsTests;

import com.onyxcodes.cookshelf.Models.Ingredient;
import com.onyxcodes.cookshelf.Models.Recipe;
import org.junit.Assert;
import org.junit.Test;

public class RecipeTests {
    @Test
    public void addRecipeTest() {
        //Given
        Recipe testRecipe = new Recipe();
        Ingredient testIngredient = new Ingredient();

        //When
        testRecipe.addIngredient(testIngredient);
        Ingredient actual = testRecipe.getIngredientList().get(0);

        //Then
        Assert.assertEquals(testIngredient, actual);
    }

    @Test
    public void removeRecipeTest() {
        //Given
        Recipe testRecipe = new Recipe();
        Ingredient testIngredient = new Ingredient();
        testRecipe.addIngredient(testIngredient);

        //When
        Assert.assertEquals(1, testRecipe.getIngredientList().size());
        testRecipe.removeIngredient(testIngredient);

        //Then
        Assert.assertEquals(0, testRecipe.getIngredientList().size());
    }

}
