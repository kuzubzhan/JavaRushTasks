package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String,Cat> map = new HashMap<String,Cat>();
        map.put("Cat01", new Cat("Cat01"));
        map.put("Cat02", new Cat("Cat02"));
        map.put("Cat03", new Cat("Cat03"));
        map.put("Cat04", new Cat("Cat04"));
        map.put("Cat05", new Cat("Cat05"));
        map.put("Cat06", new Cat("Cat06"));
        map.put("Cat07", new Cat("Cat07"));
        map.put("Cat08", new Cat("Cat08"));
        map.put("Cat09", new Cat("Cat09"));
        map.put("Cat10", new Cat("Cat10"));
        return map;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> setValues = new HashSet<Cat>(map.values());
        return setValues;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
