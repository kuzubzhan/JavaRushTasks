package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String fn;
        while (! "exit".equals(fn = br1.readLine())) {
            new ReadThread(fn);
        }
        br1.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
            run();
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void readFile() throws IOException {
            BufferedInputStream br2 = new BufferedInputStream(new FileInputStream(fileName));
            Map<Integer, Integer> map = new HashMap<>();
            while (br2.available() > 0) {
                int key = br2.read();
                if (map.containsKey(key)) {
                    int count = map.get(key);
                    map.put(key, ++count);
                }
                else map.put(key, 1);
            }
            br2.close();

            int countB = 0;
            int B = 0;
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                int i = pair.getValue();
                if (i > countB) {
                    countB = i;
                    B = pair.getKey();
                }
            }
            resultMap.put(fileName, B);
        }

        @Override
        public void run() {
            try {
                readFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
