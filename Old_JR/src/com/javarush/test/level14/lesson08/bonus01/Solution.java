package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        //Add your code here

        try
        {
            String i = null;
            i.equals("");

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] i = new int[0];
            int a = i[1];

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            List<String> i = new ArrayList<>();
            i.remove(0);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object[] x = new String[3];
            x[0] = new Integer(0);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object x = new Integer(0);
            System.out.println((String)x);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object x[] = new String[-3];

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String  s = "1jk";
            Integer d = Integer.parseInt(s);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String  s = "1jkfgkl";
            char d = s.charAt(10);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            InputStreamReader in = new InputStreamReader(new FileInputStream(""));
        } catch (Exception e)
        {
            exceptions.add(e);
        }
    }
}
