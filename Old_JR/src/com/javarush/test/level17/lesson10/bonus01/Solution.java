package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat inSD = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outSD = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if ("-c".equals(args[0])) {
            try {
                if ("м".equals(args[2]))
                    allPeople.add(Person.createMale(args[1], inSD.parse(args[3])));
                else if ("ж".equals(args[2]))
                    allPeople.add(Person.createFemale(args[1], inSD.parse(args[3])));
                System.out.println(allPeople.size()-1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else if ("-u".equals(args[0])) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            if ("м".equals(args[3]))
                person.setSex(Sex.MALE);
            else if ("ж".equals(args[3]))
                person.setSex(Sex.FEMALE);
            try {
                person.setBirthDay(inSD.parse(args[4]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            allPeople.set(Integer.parseInt(args[1]), person);
        }
        else if ("-d".equals(args[0])) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }
        else if ("-i".equals(args[0])) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            if (Sex.MALE.equals(person.getSex()))
                System.out.println(person.getName()+" м "+outSD.format(person.getBirthDay()));
            else if (Sex.FEMALE.equals(person.getSex()))
                System.out.println(person.getName()+" ж "+outSD.format(person.getBirthDay()));
        }
    }
}
