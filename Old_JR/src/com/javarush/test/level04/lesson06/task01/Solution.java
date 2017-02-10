package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int var1 = Integer.parseInt(bufferedReader.readLine());
        int var2 = Integer.parseInt(bufferedReader.readLine());
        if (var1 > var2)
            System.out.println(var2);
        else
            System.out.println(var1);
    }
}