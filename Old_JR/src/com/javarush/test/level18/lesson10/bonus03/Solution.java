package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        if ("-u".equals(args[0]) || "-d".equals(args[0])) {
            String id = args[1];
            List<String> list = new ArrayList<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fn = br.readLine();
            br.close();
            BufferedReader fr = new BufferedReader(new FileReader(fn));
            while (fr.ready()) {
                String allStr = fr.readLine();
                if (allStr.length() > 7) {
                    String subStr = allStr.substring(0, 8).trim();
                    if (subStr.equals(id)) {
                        if ("-u".equals(args[0])) {
                            list.add(String.format("%-8.8s", args[1]) +
                                    String.format("%-30.30s", args[2]) +
                                    String.format("%-8.8s", args[3]) +
                                    String.format("%-4.4s", args[4]));
                        }
                    } else list.add(allStr);
                }
            }
            fr.close();
            BufferedWriter fw = new BufferedWriter(new FileWriter(fn));
            for (String s : list) {
                fw.write(s + "\n");
            }
            fw.close();
        }
    }
}
