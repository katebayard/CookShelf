package com.onyxcodes.cookshelf.ModelsTests;

import com.onyxcodes.cookshelf.Models.Cookbook;
import com.onyxcodes.cookshelf.Models.Recipe;
import org.junit.Assert;
import org.junit.Test;

public class CookbookTests {

    @Test
    public void addRecipeTest() {
        //Given
        Cookbook testCookbook = new Cookbook();
        Recipe testRecipe = new Recipe();

        //When
        testCookbook.addRecipe(testRecipe);
        Recipe actual = testCookbook.getRecipeList().get(0);

        //Then
        Assert.assertEquals(testRecipe, actual);
    }

    @Test
    public void removeRecipeTest() {
        //Given
        Cookbook testCookbook = new Cookbook();
        Recipe testRecipe = new Recipe();
        testCookbook.addRecipe(testRecipe);

        //When
        Assert.assertEquals(1, testCookbook.getRecipeList().size());
        testCookbook.removeRecipe(testRecipe);

        //Then
        Assert.assertEquals(0, testCookbook.getRecipeList().size());
    }
}
