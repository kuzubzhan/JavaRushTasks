package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandMather_1 = new Human();
        grandMather_1.name = "Анисья";
        grandMather_1.age = 51;

        Human grandMather_2 = new Human();
        grandMather_2.name = "Вера";
        grandMather_2.age = 52;

        Human grandFather_1 = new Human();
        grandFather_1.name = "Федя";
        grandFather_1.sex = true;
        grandFather_1.age = 51;

        Human grandFather_2 = new Human();
        grandFather_2.name = "Степан";
        grandFather_2.sex = true;
        grandFather_2.age = 52;



        Human father = new Human();
        father.name = "Миша";
        father.sex = true;
        father.age = 30;
        father.father = grandFather_1;
        father.mother = grandMather_1;

        Human mother = new Human();
        mother.name = "Оля";
        mother.age = 29;
        mother.father = grandFather_2;
        mother.mother = grandMather_2;



        Human son1 = new Human();
        son1.name = "Сергей";
        son1.sex = true;
        son1.age = 5;
        son1.father = father;
        son1.mother = mother;

        Human son2 = new Human();
        son2.name = "Юра";
        son2.sex = true;
        son2.age = 8;
        son2.father = father;
        son2.mother = mother;

        Human doch = new Human();
        doch.name = "Лена";
        doch.age = 10;
        doch.father = father;
        doch.mother = mother;


        System.out.println(grandFather_1);
        System.out.println(grandMather_1);
        System.out.println(grandFather_2);
        System.out.println(grandMather_2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(doch);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
