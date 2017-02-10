package com.javarush.test.level17.lesson10.bonus02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static synchronized void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat inSD = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outSD = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        int lengthArgs = args.length - 1;
        int target = 1;
        if ("-c".equals(args[0])) {
            try {
                for (int i = 0; i < lengthArgs / 3; i++) {
                    if ("м".equals(args[target + 1]))
                        allPeople.add(Person.createMale(args[target], inSD.parse(args[target + 2])));
                    else if ("ж".equals(args[target + 1]))
                        allPeople.add(Person.createFemale(args[target], inSD.parse(args[target + 2])));
                    System.out.println(allPeople.size() - 1);
                    target += 3;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else if ("-u".equals(args[0])) {
            for (int i = 0; i < lengthArgs / 4; i++) {
                Person person = allPeople.get(Integer.parseInt(args[target]));
                person.setName(args[target + 1]);
                if ("м".equals(args[target + 2]))
                    person.setSex(Sex.MALE);
                else if ("ж".equals(args[target + 2]))
                    person.setSex(Sex.FEMALE);
                try {
                    person.setBirthDay(inSD.parse(args[target + 3]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                allPeople.set(Integer.parseInt(args[target]), person);
                target += 4;
            }
        }
        else if ("-d".equals(args[0])) {
            for (int i = 0; i < lengthArgs; i++) {
                Person person = allPeople.get(Integer.parseInt(args[target]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDay(null);
                target += 1;
            }
        }
        else if ("-i".equals(args[0])) {
            for (int i = 0; i < lengthArgs; i++) {
                Person person = allPeople.get(Integer.parseInt(args[target]));
                if (Sex.MALE.equals(person.getSex()))
                    System.out.println(person.getName()+" м "+outSD.format(person.getBirthDay()));
                else if (Sex.FEMALE.equals(person.getSex()))
                    System.out.println(person.getName()+" ж "+outSD.format(person.getBirthDay()));
                target += 1;
            }
        }
    }
}
