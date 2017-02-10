package com.javarush.test.level15.lesson12.home04;

/**
 * Created by frenchman on 05.07.2016.
 */
public class Sun implements Planet {
    private static Sun ourInstance = new Sun();

    public static Sun getInstance() {
        return ourInstance;
    }

    private Sun() {
    }
}
