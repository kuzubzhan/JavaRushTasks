package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by frenchman on 13.07.2016.
 */
public abstract class DrinkMaker {
    public abstract void getRightCup();
    public abstract void putIngredient();
    public abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
