package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        FileInputStream fis = new FileInputStream(s);
        Map<Integer, Integer> map = new HashMap<>();
        while (fis.available() > 0) {
            int b = fis.read();
            if (! map.containsKey(b)) map.put(b, 1);
            else map.put(b, map.get(b)+1);
        }
        fis.close();
        Object[] sortValue = map.values().toArray();
        Arrays.sort(sortValue);
        Object min = sortValue[0];
        for (Map.Entry e : map.entrySet()) {
            if (e.getValue().equals(min)) System.out.print(e.getKey()+" ");
        }
    }
}
