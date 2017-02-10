package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        FileInputStream fis = new FileInputStream(s);
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        fis.close();
        int count = 0;
        for (byte b : arr) {
            if (44 == b) count++;
        }
        System.out.println(count);
    }
}
