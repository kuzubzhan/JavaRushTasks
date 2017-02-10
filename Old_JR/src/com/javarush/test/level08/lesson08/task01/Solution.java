package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        set.add("Люда");
        set.add("Люма");
        set.add("Люка");
        set.add("Любкаа");
        set.add("Людка");
        set.add("Лююююба");
        set.add("Любггга");
        set.add("Любалл");
        set.add("Любагггг");
        set.add("Люброра");
        set.add("Любапп");
        set.add("Люблла");
        set.add("Любапра");
        set.add("Любра");
        set.add("Люннба");
        set.add("Любнна");
        set.add("Любена");
        set.add("Любга");
        set.add("Любннга");
        set.add("Любгаа");

        return set;
    }

//    public static void main(String[] args) {
//        HashSet<String> stringHashSet = createSet();
//        for (String x:stringHashSet
//             ) {
//            System.out.println(x);
//        }
//    }
}
