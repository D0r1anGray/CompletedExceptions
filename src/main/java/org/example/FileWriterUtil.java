package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
    public static void writeToFile(String fileName, String data) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
