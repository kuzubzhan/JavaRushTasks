package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rez = 0;
        for (; true; ) {
            String str = br.readLine();
            if ("сумма".equals(str)) {
                System.out.println(rez);
                break;
            }
            int i = Integer.parseInt(str);
            rez = rez + i;
        }
    }
}
