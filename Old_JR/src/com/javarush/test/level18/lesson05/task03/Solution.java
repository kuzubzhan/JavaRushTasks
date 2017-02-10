package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fn1 = br.readLine();
        String fn2 = br.readLine();
        String fn3 = br.readLine();
        br.close();

        FileInputStream fis1 = new FileInputStream(fn1);
        FileOutputStream fos2 = new FileOutputStream(fn2);
        FileOutputStream fos3 = new FileOutputStream(fn3);
        byte[] buffer1 = new byte[fis1.available()];

        int count1 = fis1.read(buffer1);
        int count2;
        if (count1%2 != 0) count2 = count1/2+1;
        else count2 = count1/2;
        int count3 = count1/2;

        fos2.write(buffer1, 0, count2);
        fos3.write(buffer1, count2, count3);

        fis1.close();
        fos2.close();
        fos3.close();
    }
}
