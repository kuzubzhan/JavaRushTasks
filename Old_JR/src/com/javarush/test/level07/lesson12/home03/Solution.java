package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        ArrayList<Integer> integers = new ArrayList<Integer>(20);
        for (int i = 0; i < 20; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 20-1; i++) {
            for (int j = i+1; j < 20; j++) {
                if (integers.get(i) < integers.get(j)) {
                    int c = integers.get(i);
                    integers.set(i, integers.get(j));
                    integers.set(j, c);
                }
            }
        }
        maximum = integers.get(0);
        minimum = integers.get(20-1);

        System.out.println(maximum+" "+minimum);
    }
}
