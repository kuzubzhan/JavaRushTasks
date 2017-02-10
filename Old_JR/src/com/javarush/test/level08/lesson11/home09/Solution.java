package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String date = "MAY 1 2013";
        System.out.println(date+" = "+isDateOdd(date));
    }

    public static boolean isDateOdd(String date)
    {
        Date currentData = new Date(date);
        Date beginData = new Date(currentData.getYear(),0,1,0,0,0);
        long beginDataTime = beginData.getTime();
        long endDataTime = currentData.getTime();

        long msDelay = endDataTime - beginDataTime;
        long msDay = 24*60*60*1000;
        int rez = (int)(msDelay/msDay);
        return rez %2 == 0;
    }
}
