package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        if ("-c".equals(args[0])) {
            List<String> list = new ArrayList<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fn = br.readLine();
            br.close();
            Pattern p = Pattern.compile("(\\d+).*");
            Matcher m;
            int id = 0;
            BufferedReader fr = new BufferedReader(new FileReader(fn));
            while (fr.ready()) {
                String str = fr.readLine();
                list.add(str);
                m = p.matcher(str);
                if (m.find()) {
                    str = m.group(1);
                    int maxID = Integer.parseInt(str);
                    if (maxID > id) id = maxID;
                }
            }
            fr.close();
            BufferedWriter fw = new BufferedWriter(new FileWriter(fn));
            for (String s : list) {
                fw.write(s+"\n");
            }

            id++;
            fw.write(writeToStr(String.valueOf(id), 8)+writeToStr(args[1], 30)+writeToStr(args[2], 8)+writeToStr(args[3], 4));
            fw.close();
        }
    }
    private static String writeToStr(String s, int length) throws IOException {
        String rez = "";
        char[] chars = String.valueOf(s).toCharArray();
        for (int i = 0; i < length; i++) {
            if (chars.length > i) rez += chars[i];
            else rez += " ";
        }
        return rez;
    }
}
