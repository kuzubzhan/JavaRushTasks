package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i; j < list.size()-1; j++) {
                if (list.get(i).length() < list.get(j+1).length()) {
                    String a = list.get(i);
                    list.set(i, list.get(j+1));
                    list.set(j+1, a);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (i < list.size()-1 && list.get(i).length() > list.get(i+1).length()) break;
        }
    }
}
