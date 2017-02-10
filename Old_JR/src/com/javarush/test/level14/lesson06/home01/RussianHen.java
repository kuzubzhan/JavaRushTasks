package com.javarush.test.level14.lesson06.home01;

/**
 * Created by frenchman on 30.06.2016.
 */
class RussianHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription() {
        return super.getDescription() +
                " Моя страна - "+Country.RUSSIA+
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
