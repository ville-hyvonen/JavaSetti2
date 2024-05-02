package org.example;
import java.io.File;
public class Teht13 {

    static long size = 0;

    static long dirSizeCalc(File x) {

        if (x.isDirectory()) {

            File[] files = x.listFiles();

            for (File file : files) {
                if (file.isDirectory()) {
                    size += dirSizeCalc(file);
                } else {
                    size += file.length();
                }
            }
        }
        return size;
    }
}
