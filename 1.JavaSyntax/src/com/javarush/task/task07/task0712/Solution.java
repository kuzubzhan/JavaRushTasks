package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int max = 0;
        int indMax = 0;
        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            list.add(s);
            int size = s.length();
            if (size > max) {
                max = size;
                indMax = i;
            }
        }

        int min = max;
        int indMin = indMax;
        for (int i = 0; i < list.size(); i++) {
            int size = list.get(i).length();
            if (size < min) {
                min = size;
                indMin = i;
            }
        }

        if (indMax > indMin) System.out.println(list.get(indMin));
        else if (indMax < indMin) System.out.println(list.get(indMax));
    }
}