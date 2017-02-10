package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int var1 = Integer.parseInt(bufferedReader.readLine());
        int var2 = Integer.parseInt(bufferedReader.readLine());
        int var3 = Integer.parseInt(bufferedReader.readLine());
        int var4 = Integer.parseInt(bufferedReader.readLine());
        if (var1 < var2)
            var1 = var2;
        if (var3 < var4)
            var3 = var4;
        if (var1 < var3)
            System.out.println(var3);
        else
            System.out.println(var1);
    }
}
