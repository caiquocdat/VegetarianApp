package com.caiquocdat.vegetarian.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DailyMenuModel implements Serializable {
    private int id;
    private ArrayList<MealTimeModel> mealTimes;
    private ArrayList<DishModel> dishes; // New field

    public DailyMenuModel(int id, ArrayList<MealTimeModel> mealTimes, ArrayList<DishModel> dishes) {
        this.id = id;
        this.mealTimes = mealTimes;
        this.dishes = dishes;
    }

    public ArrayList<DishModel> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<DishModel> dishes) {
        this.dishes = dishes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<MealTimeModel> getMealTimes() {
        return mealTimes;
    }

    public void setMealTimes(ArrayList<MealTimeModel> mealTimes) {
        this.mealTimes = mealTimes;
    }
}
