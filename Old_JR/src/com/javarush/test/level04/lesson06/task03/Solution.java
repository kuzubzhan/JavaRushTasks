package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if (a >= b && a >= c)
        {
            System.out.println(a);
            sort(b,c);
            return;
        }
        if (b >= a && b >= c)
        {
            System.out.println(b);
            sort(a,c);
            return;
        }
        if (c >= a && c >= b)
        {
            System.out.println(c);
            sort(a,b);
        }
    }
    private static void sort(int a, int b){
        if (a >= b)
        {
            System.out.println(a);
            System.out.println(b);
        }
        else
        {
            System.out.println(b);
            System.out.println(a);

        }
    }
}
