package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
        String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
        s1 = 1;
        s2 = 2;
        s3 = 3;
        s4 = 4;
        s5 = 5;
        s6 = 6;
        s7=7;
        s8=8;
        s9=9;
        s10=10;
        a1 = s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8+" "+s9+" "+s10;
        a2 = s1*2+" "+s2*2+" "+s3*2+" "+s4*2+" "+s5*2+" "+s6*2+" "+s7*2+" "+s8*2+" "+s9*2+" "+s10*2;
        a3 = s1*3+" "+s2*3+" "+s3*3+" "+s4*3+" "+s5*3+" "+s6*3+" "+s7*3+" "+s8*3+" "+s9*3+" "+s10*3;
        a4 = s1*4+" "+s2*4+" "+s3*4+" "+s4*4+" "+s5*4+" "+s6*4+" "+s7*4+" "+s8*4+" "+s9*4+" "+s10*4;
        a5 = s1*5+" "+s2*5+" "+s3*5+" "+s4*5+" "+s5*5+" "+s6*5+" "+s7*5+" "+s8*5+" "+s9*5+" "+s10*5;
        a6 = s1*6+" "+s2*6+" "+s3*6+" "+s4*6+" "+s5*6+" "+s6*6+" "+s7*6+" "+s8*6+" "+s9*6+" "+s10*6;
        a7 = s1*7+" "+s2*7+" "+s3*7+" "+s4*7+" "+s5*7+" "+s6*7+" "+s7*7+" "+s8*7+" "+s9*7+" "+s10*7;
        a8 = s1*8+" "+s2*8+" "+s3*8+" "+s4*8+" "+s5*8+" "+s6*8+" "+s7*8+" "+s8*8+" "+s9*8+" "+s10*8;
        a9 = s1*9+" "+s2*9+" "+s3*9+" "+s4*9+" "+s5*9+" "+s6*9+" "+s7*9+" "+s8*9+" "+s9*9+" "+s10*9;
        a10 = s1*10+" "+s2*10+" "+s3*10+" "+s4*10+" "+s5*10+" "+s6*10+" "+s7*10+" "+s8*10+" "+s9*10+" "+s10*10;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(a9);
        System.out.println(a10);

    }
}