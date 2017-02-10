package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int var = Integer.parseInt(bufferedReader.readLine());
        if (var == 1)
        {
            System.out.println("понедельник");
            return;
        }
        if (var == 2)
        {
            System.out.println("вторник");
            return;
        }
        if (var == 3)
        {
            System.out.println("среда");
            return;
        }
        if (var == 4)
        {
            System.out.println("четверг");
            return;
        }
        if (var == 5)
        {
            System.out.println("пятница");
            return;
        }
        if (var == 6)
        {
            System.out.println("суббота");
            return;
        }
        if (var == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");
    }
}