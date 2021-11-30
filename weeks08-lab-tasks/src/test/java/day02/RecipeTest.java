package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    Recipe recipe = new Recipe("recipe1");
    Recipe recipeWithDescription = new Recipe("recipe2", "description");


    @Test
    void createTest() {
        assertEquals("recipe1", recipe.getName());
        assertEquals("recipe2", recipeWithDescription.getName());
        assertEquals("description", recipeWithDescription.getDescription());
    }

    @Test
    void addIngredient() {
        assertEquals(0, recipe.getIngredients().size());
        recipe.addIngredient("első");
        assertEquals(1, recipe.getIngredients().size());
        recipe.addIngredient("második", "harmadik");
        assertEquals(3, recipe.getIngredients().size());
        recipe.addIngredient("negyedik", "ötödik", "hatodik");
        assertEquals(6, recipe.getIngredients().size());
        assertEquals("negyedik", recipe.getIngredients().get(3));
    }
}