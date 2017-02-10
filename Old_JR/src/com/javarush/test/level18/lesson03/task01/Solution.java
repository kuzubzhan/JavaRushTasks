package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        FileInputStream fis = new FileInputStream(s);
        int max = Byte.MIN_VALUE;
        while (fis.available() > 0) {
            int b = fis.read();
            if (max < b) max =  b;
        }
        System.out.println(max);
        br.close();
        fis.close();
    }
}
