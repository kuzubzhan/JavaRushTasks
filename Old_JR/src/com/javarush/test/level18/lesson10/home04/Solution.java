package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fn1 = br.readLine();
        String fn2 = br.readLine();
        br.close();
        BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(fn1));
        byte[] buf1 = new byte[fis1.available()];
        int count1 = fis1.read(buf1);
        fis1.close();
        BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream(fn2));
        BufferedOutputStream fos1 = new BufferedOutputStream(new FileOutputStream(fn1));
        while (fis2.available() > 0) {
            fos1.write(fis2.read());
        }
        fos1.write(buf1, 0, count1);
        fis2.close();
        fos1.close();
    }
}
