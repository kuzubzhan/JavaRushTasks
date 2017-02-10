package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String a1, a2, a3, s1, s2, s3, s4, s5, s6;
        a1 = "Мама";
        a2 = "Мыла";
        a3 = "Раму";
        s1 = a3+a2+a1;
        s2 = a3+a1+a2;
        s3 = a2+a3+a1;
        s4 = a2+a1+a3;
        s5 = a1+a3+a2;
        s6 = a1+a2+a3;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

    }
}