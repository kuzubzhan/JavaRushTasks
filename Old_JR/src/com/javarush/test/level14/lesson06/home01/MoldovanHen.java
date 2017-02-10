package com.javarush.test.level14.lesson06.home01;

/**
 * Created by frenchman on 30.06.2016.
 */
class MoldovanHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription() +
                " Моя страна - "+Country.MOLDOVA+
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
