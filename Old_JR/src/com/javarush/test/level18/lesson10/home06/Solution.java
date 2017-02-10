package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fn = args[0];
        BufferedReader br = new BufferedReader(new FileReader(fn));
        Map<Integer, Integer> map = new TreeMap<>();
        while (br.ready()) {
            int key = br.read();
            if (map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, ++count);
            }
            else map.put(key, 1);
        }
        br.close();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int i = pair.getKey();
            System.out.println((char) i+" "+pair.getValue());
        }
    }
}
