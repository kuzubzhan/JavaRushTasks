package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.*;


/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Petrov", "Ivan");
        map.put("Sidorov", "Ivan");
        map.put("Ivanov", "Stepan");
        map.put("Dymov", "Stepan");
        map.put("Mikhailov", "Sergei");
        map.put("Stallone", "Sergei");
        map.put("Spiridonov", "Misha");
        map.put("Pozner", "Petia");
        map.put("Urgant", "Vova");
        map.put("Spivakov", "Gena");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        String[] str = map.values().toArray(new String[map.size()]);
        for (int i = 0; i < str.length-1; i++) {
            int count = 0;
            for (int j = i; j < str.length-1; j++) {
                if (str[i].equals(str[j+1])) count++;
            }
            if (count > 0) removeItemFromMapByValue(map, str[i]);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value)){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = createMap();
        System.out.println(hashMap);
        removeTheFirstNameDuplicates(hashMap);
        System.out.println(hashMap);
    }
}
