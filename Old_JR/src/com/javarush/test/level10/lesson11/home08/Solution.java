package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] arr = new ArrayList[3];
        arr[0] = new ArrayList<String>();
        arr[0].add("Hellow_0");
        arr[0].add("World_0");

        arr[1] = new ArrayList<String>();
        arr[1].add("Hellow_1");
        arr[1].add("World_1");

        arr[2] = new ArrayList<String>();
        arr[2].add("Hellow_2");
        arr[2].add("World_2");

        return arr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}