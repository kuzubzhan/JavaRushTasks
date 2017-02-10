package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fn1 = br.readLine();
        String fn2 = br.readLine();
        br.close();

        FileInputStream fis1 = new FileInputStream(fn1);
        FileOutputStream fos2 = new FileOutputStream(fn2);
        byte[] buffer1 = new byte[fis1.available()];
        int count = fis1.read(buffer1);

        for (int i = count-1; i >= 0 ; i--) {
            fos2.write(buffer1[i]);
        }

        fis1.close();
        fos2.close();
    }
}
