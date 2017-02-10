package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private int age;
        private int weight;
        private String growth;
        private String colorSkin;

        public Human(String firstName){
            this.firstName = firstName;
        }
        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public Human(String firstName, String lastName, int age, int weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
        }
        public Human(String firstName, String lastName, int age, int weight, String growth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.growth = growth;
        }
        public Human(String firstName, String lastName, int age, int weight, String growth, String colorSkin) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.growth = growth;
            this.colorSkin = colorSkin;
        }
        public Human(String firstName, String lastName, String growth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.growth = growth;
        }
        public Human(String firstName, String lastName, String growth, String colorSkin) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.growth = growth;
            this.colorSkin = colorSkin;
        }
        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }
        public Human(String firstName, int age, int weight) {
            this.firstName = firstName;
            this.age = age;
            this.weight = weight;
        }
    }
}
