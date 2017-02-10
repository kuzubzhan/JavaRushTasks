package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fn = args[0];
        BufferedReader br = new BufferedReader(new FileReader(fn));
        Pattern p = Pattern.compile("[a-zA-Z]");
        int count = 0;
        while (br.ready()) {
            char c = (char) br.read();
            if (p.matcher(String.valueOf(c)).matches()) count++;
        }
        br.close();
        System.out.println(count);
    }
}
