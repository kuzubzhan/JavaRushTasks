package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //add your code here
//        String s = "javarush.ru/alpha/index.html?lvl=15&??view&&&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&&?oobj=3.0&obj=&=";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] arr = br.readLine().split("\\?|&");
            List<String> list = new ArrayList<>();
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].contains("=")) {
                    String[] cutArr = arr[i].split("=");
                    if (cutArr.length > 0) System.out.print(cutArr[0]+" ");
                    if (cutArr.length > 1 && cutArr[0].equals("obj")) list.add(cutArr[1]);
                }
                else if (!arr[i].isEmpty()) System.out.print(arr[i]+" ");
            }

            if (list.isEmpty()) return;
            System.out.println();
            for (String s : list) {
                try {
                    alert(Double.parseDouble(s));
                } catch (NumberFormatException e) {
                    alert(s);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
