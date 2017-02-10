package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nf = br.readLine();
//        String nf = "c:/data.txt";

        BufferedReader br1 = new BufferedReader(new FileReader(nf));
        List<Integer> list = new ArrayList<>();

        while (br1.ready()) {
            int i = Integer.parseInt(br1.readLine());
            if (i%2 == 0) list.add(i);
        }

        Object[] o = list.toArray();
        Arrays.sort(o);

        for (Object ob : o) {
            System.out.println(ob);
        }

        br.close();
        br1.close();
    }
}
