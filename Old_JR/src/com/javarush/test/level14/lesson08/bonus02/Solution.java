package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br.readLine());
        int i2 = Integer.parseInt(br.readLine());

        int nod = 1;
        for (int i = 2; i <= Math.min(i1, i2); i++) {
            if (i1 % i == 0 && i2 % i == 0) {
                nod = i;
            }
        }

        System.out.println(nod);
    }
}
