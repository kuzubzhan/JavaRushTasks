package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nf = br.readLine();

//        String st = "c:/data.txt";
        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(nf)));

        while (br1.ready()) {
            System.out.println(br1.readLine());
        }

        br.close();
        br1.close();
    }
}
