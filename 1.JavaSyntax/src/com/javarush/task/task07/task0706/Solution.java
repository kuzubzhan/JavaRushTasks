package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] house = new int[15];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 15; i++) {
            int people = Integer.parseInt(br.readLine());
            house[i] = people;
            if (i == 0 || i % 2 == 0) even += people;
            else if (i % 2 != 0) odd += people;
        }
        if (even < odd) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        if (even > odd) System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}