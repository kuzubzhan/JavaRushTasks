package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int result = 0;
        double count = 0;
        while (!"-1".equals(str = br.readLine())) {
            result += Integer.parseInt(str);
            count++;
        }
        System.out.println(result / count);
    }
}