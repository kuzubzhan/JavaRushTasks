package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.

Подсказка:
Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }
    
    static class MyException extends Exception {
    }

    static class MyException2 extends RuntimeException {
    }

    static class MyException3 extends MyException {
    }

    static class MyException4 extends MyException2 {
    }
}