package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Jan", new Date("JULY 1 1974"));
        map.put("Stallone3", new Date("APRIL 1 2010"));
        map.put("Stallone4", new Date("OCTOBER 1 1970"));
        map.put("Stallone5", new Date("JULY 1 1960"));
        map.put("Stallone6", new Date("JUNE 1 1950"));
        map.put("Stallone7", new Date("NOVEMBER 1 1940"));
        map.put("Stallone8", new Date("MAY 1 1930"));
        map.put("Stallone9", new Date("AUGUST 31 1920"));
        map.put("Stallone10", new Date("DECEMBER 1 1910"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
//        HashMap<String, Date> copyMap = new HashMap<String, Date>(map);
//        for (HashMap.Entry<String, Date> pair : copyMap.entrySet()) {
//            Date dataPeople = pair.getValue();
//            Date startSummer = new Date(dataPeople.getYear(),5,1,0,0,0);
//            Date endSummer = new Date(dataPeople.getYear(),8,1,0,0,0);
//            if (dataPeople.before(endSummer) && dataPeople.after(startSummer))
//                map.remove(pair.getKey());
//        }


        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Date> hashMap = createMap();
//        System.out.println(hashMap);
        removeAllSummerPeople(hashMap);
//        System.out.println(hashMap);
//        for (HashMap.Entry<String, Date> m : hashMap.entrySet()) {
//            System.out.println(m);
//        }
    }
}
