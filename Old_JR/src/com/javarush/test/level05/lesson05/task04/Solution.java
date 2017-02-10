package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

import com.javarush.test.level05.lesson05.task01.Cat;

public class Solution {
    public static void main(String[] args) {
//        com.javarush.test.Test.level05.lesson05.task01.Cat cat = new com.javarush.test.Test.level05.lesson05.task01.Cat();
        Cat cat1 = new Cat("vasa1",4,5,6);
        Cat cat2 = new Cat("vasa2",7,8,9);
        Cat cat3 = new Cat("vasa3",10,11,12);
//        Cat cat4 = new Cat(cat.getName(), cat.getAge(), cat.getWeight(), cat.getStrength());
    }

    public static class Cat {

        public static int count = 0;
        public String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
