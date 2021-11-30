package day02;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private List<String> ingredients = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredient(String ingredient, String... ingredients) {
        this.ingredients.add(ingredient);
        for (String st: ingredients) {
            this.ingredients.add(st);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
