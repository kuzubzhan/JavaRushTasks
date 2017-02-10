package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rez = "";
        String fn;
        Pattern p = Pattern.compile("(.+).part(.+)");
        Matcher m;
        Map<Integer, String> map = new TreeMap<>();
        while (! "end".equals(fn = br.readLine())) {
            m = p.matcher(fn);
            if (m.find()) {
                map.put(Integer.parseInt(m.group(2)), fn);
                if ("".equals(rez)) {
                    rez = m.group(1);
                }
            }
        }
        br.close();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(rez));
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(pair.getValue()));
            while (bis.available() > 0) {
                bos.write(bis.read());
            }
            bis.close();
            }
        bos.close();
    }
}
