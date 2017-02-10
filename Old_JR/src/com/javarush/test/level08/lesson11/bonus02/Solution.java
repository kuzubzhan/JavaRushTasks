package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
//        List<String> addresses = new ArrayList<String>();
        HashMap<String, String> sity = new HashMap<String, String>();
        while (true)
        {
            String addressFamily = reader.readLine();
            if (addressFamily.isEmpty()) break;
            String family = reader.readLine();

//            addresses.add(family);
            sity.put(addressFamily, family);
        }

        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
        String familySity = reader.readLine();
//        if (sity.containsKey(familySity)) System.out.println("yes"); else System.out.println("no");

        String familySecondName = sity.get(familySity);
        System.out.println(familySecondName);

//        if (0 <= houseNumber && houseNumber < addresses.size())
//        {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
    }
}
