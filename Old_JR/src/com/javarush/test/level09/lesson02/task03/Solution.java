package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

public class Solution
{
    public static void main(String[] args)/* throws Exception*/
    {
        method1();
    }

    public static void method1()
    {
        method2();
//        StackTraceElement[] st = Thread.currentThread().getStackTrace();
    }

    public static void method2()
    {
        method3();
//        StackTraceElement[] st = Thread.currentThread().getStackTrace();
//        return  st[2].getLineNumber();
    }

    public static void method3()
    {
        method4();
//        StackTraceElement[] st = Thread.currentThread().getStackTrace();
//        return  st[2].getLineNumber();
    }

    public static void method4()
    {
        method5();
//        StackTraceElement[] st = Thread.currentThread().getStackTrace();
//        return  st[2].getLineNumber();
    }

    public static void method5()
    {
//        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        getStackTraceDeep();
//        return  st[2].getLineNumber();
    }

    public static void getStackTraceDeep()
    {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
//        System.out.println(st.length);
        for (StackTraceElement x:st){
            System.out.println(x.getMethodName());

        }
//        return st.length;
    }

}
