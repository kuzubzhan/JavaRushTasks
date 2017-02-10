package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;


/**
 * Created by frenchman on 22.07.2016.
 */
class ImageReaderFactory {
    static ImageReader getReader(ImageTypes s) {
        if (ImageTypes.BMP.equals(s)) return new BmpReader();
        else if (ImageTypes.JPG.equals(s)) return new JpgReader();
        else if (ImageTypes.PNG.equals(s)) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
