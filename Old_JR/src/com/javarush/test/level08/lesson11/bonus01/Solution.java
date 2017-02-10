package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader zxc = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String > set = new HashSet<String >();
        set.add(zxc.readLine());
        set.add(zxc.readLine());
        set.add(zxc.readLine());
        work(set);
    }
    public static void work(HashSet<String > set){
        for (String  st : set) {
            String smonth = st;
            int month = 11;
            if (smonth.equals("January"))
                month = 0;
            if (smonth.equals("February"))
                month = 1;
            if (smonth.equals("March"))
                month = 2;
            if (smonth.equals("April"))
                month = 3;
            if (smonth.equals("May"))
                month = 4;
            if (smonth.equals("June"))
                month = 5;
            if (smonth.equals("July"))
                month = 6;
            if (smonth.equals("August"))
                month = 7;
            if (smonth.equals("September"))
                month = 8;
            if (smonth.equals("October"))
                month = 9;
            if (smonth.equals("November"))
                month = 10;
            if (smonth.equals("December"))
                month = 11;
            month += 1;
            System.out.println(smonth + " is " + month + " month");
        }
    }

}
