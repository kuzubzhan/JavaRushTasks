package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileResultPath = args[0];

        List<String> listZipPath = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            listZipPath.add(args[i]);
        }
        Collections.sort(listZipPath);

        byte[] buff = new byte[1024];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        for (String zipPath : listZipPath) {
            FileInputStream fis = new FileInputStream(zipPath);
            int count;
            while ((count = fis.read(buff)) != -1) {
                baos.write(buff, 0, count);
            }
        }

        FileOutputStream fos = new FileOutputStream(fileResultPath);
        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(baos.toByteArray()));
        baos.close();
        while (zis.getNextEntry() != null) {
            int count;
            while ((count = zis.read(buff)) != -1) {
                fos.write(buff, 0, count);
            }
        }
        zis.close();
        fos.close();
    }
}
