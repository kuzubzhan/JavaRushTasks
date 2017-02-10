package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        int i = 0;
        i = anotherCat.age > age ? i+1 : i-1;
        i = anotherCat.strength > strength ? i-1 : i+1;
        i = anotherCat.weight > weight ? i-1 : i+1;
        return i > 0;
    }
/*

    public static void main(String[] args) {
        Cat vasa = new Cat();
        Cat bomzh = new Cat();
        vasa.age = 7;
        vasa.weight = 4;
        vasa.strength = 80;
        bomzh.age = 15;
        bomzh.weight = 2;
        bomzh.strength = 40;
        System.out.println(vasa.fight(bomzh));
        System.out.println(bomzh.fight(vasa));
    }
*/
}
