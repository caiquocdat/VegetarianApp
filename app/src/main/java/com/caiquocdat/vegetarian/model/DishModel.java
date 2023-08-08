package com.caiquocdat.vegetarian.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DishModel implements Serializable {
    private int id;
    private String dishName;
    private int mealTimeId;
    private String urlImg;
    private ArrayList<IngredientModel> ingredients;
    private ArrayList<CookingStepModel> cookingSteps;

    public DishModel(int id, String dishName, int mealTimeId,String urlImg, ArrayList<IngredientModel> ingredients, ArrayList<CookingStepModel> cookingSteps) {
        this.id = id;
        this.dishName = dishName;
        this.mealTimeId = mealTimeId;
        this.urlImg=urlImg;
        this.ingredients = ingredients;
        this.cookingSteps = cookingSteps;
    }


    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getMealTimeId() {
        return mealTimeId;
    }

    public void setMealTimeId(int mealTimeId) {
        this.mealTimeId = mealTimeId;
    }

    public ArrayList<IngredientModel> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<IngredientModel> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<CookingStepModel> getCookingSteps() {
        return cookingSteps;
    }

    public void setCookingSteps(ArrayList<CookingStepModel> cookingSteps) {
        this.cookingSteps = cookingSteps;
    }
}
