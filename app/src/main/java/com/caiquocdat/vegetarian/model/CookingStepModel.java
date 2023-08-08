package com.caiquocdat.vegetarian.model;

import java.io.Serializable;

public class CookingStepModel implements Serializable {
    private int id;
    private String stepDescription;
    private int stepOrder;
    private int dishId;

    public CookingStepModel(int id, String stepDescription, int stepOrder, int dishId) {
        this.id = id;
        this.stepDescription = stepDescription;
        this.stepOrder = stepOrder;
        this.dishId = dishId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }

    public int getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(int stepOrder) {
        this.stepOrder = stepOrder;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }
}
