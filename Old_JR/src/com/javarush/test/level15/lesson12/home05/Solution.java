package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.util.Objects;

public class Solution {
    public Solution() {

    }
    public Solution(String a) {

    }
    public Solution(int a) {

    }

    private Solution(String a, String b) {

    }
    private Solution(String a, int b) {

    }
    private Solution(int a, int b) {

    }

    protected Solution(String a, String b, int c) {

    }
    protected Solution(String a, int b, int c) {

    }
    protected Solution(int a, int b, int c) {

    }

    Solution(Objects o) {

    }
    Solution(Float f) {

    }
    Solution(Double d) {

    }
}
