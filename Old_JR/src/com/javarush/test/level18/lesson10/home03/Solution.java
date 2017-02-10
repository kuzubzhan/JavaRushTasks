package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fn1 = br.readLine();
        String fn2 = br.readLine();
        String fn3 = br.readLine();
        BufferedOutputStream fos1 = new BufferedOutputStream(new FileOutputStream(fn1));
        BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream(fn2));
        BufferedInputStream fis3 = new BufferedInputStream(new FileInputStream(fn3));
        while (fis2.available() > 0) {
            fos1.write(fis2.read());
        }
        while (fis3.available() > 0) {
            fos1.write(fis3.read());
        }
        br.close();
        fos1.close();
        fis2.close();
        fis3.close();
    }
}
