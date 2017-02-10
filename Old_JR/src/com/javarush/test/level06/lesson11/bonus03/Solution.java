package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
5
2
15
6
17
Пример вывода:
2
5
6
15
17
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];
        for (int i = 0; i < 5; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < 5; j++) {
            for (int i = j+1; i < 5; i++) {
                int a = Math.min(mas[j], mas[i]);
                int b = Math.max(mas[j], mas[i]);
                mas[j] = a;
                mas[i] = b;
            }
            System.out.println(mas[j]);
        }
    }
}
