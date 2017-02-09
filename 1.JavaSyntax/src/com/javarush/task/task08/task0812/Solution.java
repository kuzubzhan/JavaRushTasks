package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            list.add(number);
        }

        int maxCount = 1;
        for (int i = 0; i < list.size(); i++) {
            int firstElem = list.get(i);
            int count = 1;

            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j) == firstElem) {
                    count++;
                    if (count > maxCount) maxCount = count;
                }
                else {
                    i = j - 1;
                    break;
                }
                if (j == list.size() - 1) {
                    i = j;
                }
            }
        }
        System.out.println(maxCount);
    }
}