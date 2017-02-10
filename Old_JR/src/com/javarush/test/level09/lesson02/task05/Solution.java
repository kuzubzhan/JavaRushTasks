package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/

import java.util.Date;

public class Solution
{
    public static int getStackTraceDeep()
    {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        System.out.println(st.length);
        return st.length;
    }
}
