package com.caiquocdat.vegetarian.model;

import java.io.Serializable;

public class IngredientModel implements Serializable {
    private int id;
    private String ingredientName;
    private int dishId;

    public IngredientModel(int id, String ingredientName, int dishId) {
        this.id = id;
        this.ingredientName = ingredientName;
        this.dishId = dishId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }
}
