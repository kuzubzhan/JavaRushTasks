package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put("aaa", 400);
            put("bbb", 500);
            put("ccc", 100);
            put("ddd", 500);
            put("eee", 400);
            put("fff", 300);
            put("ggg", 500);
            put("hhh", 300);
            put("iii", 200);
            put("jjj", 100);
        }};
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        ArrayList<Map.Entry<String, Integer>> listEntry = new ArrayList<>(map.entrySet());
        for (Map.Entry<String, Integer> entry : listEntry) {
            if (entry.getValue() < 500) map.remove(entry.getKey());
        }
    }

    public static void main(String[] args) {
    }
}