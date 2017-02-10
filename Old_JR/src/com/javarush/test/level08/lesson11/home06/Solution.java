package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather_1 = new Human();
        Human grandMather_1 = new Human();
        Human grandFather_2 = new Human();
        Human grandMather_2 = new Human();

        Human father = new Human();
        Human mather = new Human();

        Human children_1 = new Human();
        Human children_2 = new Human();
        Human children_3 = new Human();


        grandFather_1.name = "nameGrandFather_1";
        grandFather_1.sex = true;
        grandFather_1.age = 70;
        grandFather_1.children.add(father);

        grandMather_1.name = "nameGrandMather_1";
        grandMather_1.age = 68;
        grandMather_1.children.add(father);


        grandFather_2.name = "nameGrandFather_2";
        grandFather_2.sex = true;
        grandFather_2.age = 69;
        grandFather_2.children.add(mather);

        grandMather_2.name = "nameGrandMather_2";
        grandMather_2.age = 67;
        grandMather_2.children.add(mather);


        father.name = "nameFather";
        father.sex = true;
        father.age = 30;
        father.children.add(children_1);
        father.children.add(children_2);
        father.children.add(children_3);

        mather.name = "nameMather";
        mather.age = 25;
        mather.children.add(children_1);
        mather.children.add(children_2);
        mather.children.add(children_3);

        children_1.name = "nameChildren_1";
        children_1.age = 15;

        children_2.name = "nameChildren_2";
        children_2.age = 10;

        children_3.name = "nameChildren_3";
        children_3.age = 5;

        System.out.println(grandFather_1);
        System.out.println(grandMather_1);
        System.out.println(grandFather_2);
        System.out.println(grandMather_2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(children_1);
        System.out.println(children_2);
        System.out.println(children_3);

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
