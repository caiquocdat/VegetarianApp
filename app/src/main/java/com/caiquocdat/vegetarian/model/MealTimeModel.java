package com.caiquocdat.vegetarian.model;

import java.io.Serializable;
import java.util.List;

public class MealTimeModel implements Serializable {
    private int id;
    private String mealType; // e.g., "Breakfast", "Lunch", "Dinner"
    private int dailyMenuId;
    private String detail;

    public MealTimeModel(int id, String mealType, int dailyMenuId, String detail) {
        this.id = id;
        this.mealType = mealType;
        this.dailyMenuId = dailyMenuId;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getDailyMenuId() {
        return dailyMenuId;
    }

    public void setDailyMenuId(int dailyMenuId) {
        this.dailyMenuId = dailyMenuId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
