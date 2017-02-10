package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "zer1";

        Zerg zerg2 = new Zerg();
        zerg2.name = "zer2";

        Zerg zerg3 = new Zerg();
        zerg3.name = "zer3";

        Zerg zerg4 = new Zerg();
        zerg4.name = "zer4";

        Zerg zerg5 = new Zerg();
        zerg5.name = "zer5";

        Zerg zerg6 = new Zerg();
        zerg6.name = "zer6";

        Zerg zerg7 = new Zerg();
        zerg7.name = "zer7";

        Zerg zerg8 = new Zerg();
        zerg8.name = "zer8";

        Zerg zerg9 = new Zerg();
        zerg9.name = "zer9";

        Zerg zerg10 = new Zerg();
        zerg10.name = "zer10";

        Protos protos1 = new Protos();
        protos1.name = "pro1";

        Protos protos2 = new Protos();
        protos2.name = "pro2";

        Protos protos3 = new Protos();
        protos3.name = "pro3";

        Protos protos4 = new Protos();
        protos4.name = "pro4";

        Protos protos5 = new Protos();
        protos5.name = "pro5";

        Terran terran1 = new Terran();
        terran1.name = "terr1";

        Terran terran2 = new Terran();
        terran2.name = "terr2";

        Terran terran3 = new Terran();
        terran3.name = "terr3";

        Terran terran4 = new Terran();
        terran4.name = "terr4";

        Terran terran5 = new Terran();
        terran5.name = "terr5";

        Terran terran6 = new Terran();
        terran6.name = "terr6";

        Terran terran7 = new Terran();
        terran7.name = "terr7";

        Terran terran8 = new Terran();
        terran8.name = "terr8";

        Terran terran9 = new Terran();
        terran9.name = "terr9";

        Terran terran10 = new Terran();
        terran10.name = "terr10";

        Terran terran11 = new Terran();
        terran11.name = "terr11";

        Terran terran12 = new Terran();
        terran12.name = "terr12";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}