package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(args[1]));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(args[2]));
        int key = 1;
        if ("-e".equals(args[0])) {
            while (bis.available() > 0) {
                bos.write(bis.read()+key);
            }
        }
        else {
            while (bis.available() > 0) {
                bos.write(bis.read()-key);
            }
        }
        bis.close();
        bos.close();
    }
}
