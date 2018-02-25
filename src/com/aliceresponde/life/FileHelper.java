package com.aliceresponde.life;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public final class FileHelper {
    public static final String ENTER = String.format("%n");

    private FileHelper() throws IOException {
        throw new ExceptionInInitializerError("private constructor");
    }

    public static String printFile(Path filePath) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br =Files.newBufferedReader(filePath);
        String line =  br.readLine();
        while (line!=null){
            stringBuilder.append(line).append(ENTER);
            line = br.readLine();
        }
        return stringBuilder.toString();
    }


}
