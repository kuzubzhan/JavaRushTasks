package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fn1 = br.readLine();
        String fn2 = br.readLine();
        br.close();
        BufferedReader fis1 = new BufferedReader(new FileReader(fn1));
        BufferedWriter fos2 = new BufferedWriter(new FileWriter(fn2));
        while (fis1.ready()) {
            String ins = fis1.readLine();
            if (ins.isEmpty()) continue;
            String[] spls = ins.split("[^0-9.-]");
            for (String ns : spls) {
                int round = Math.round(Float.parseFloat(ns));
                fos2.write(String.valueOf(round)+" ");
            }
        }
        fis1.close();
        fos2.close();
    }
}
