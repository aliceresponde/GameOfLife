package com.aliceresponde.life;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFileHelper {

    private static final String FILE_PATH = "src/raw/input.txt";
    private Path path;

    @Before
    public void init() {
        path = Paths.get(FILE_PATH);
    }

    @Test
    public void givenExistentPath_whenConfirmsFileExists_thenCorrect() {
        boolean exists = Files.exists(path);
        Assert.assertTrue(exists);
    }

    @Test(expected = IOException.class)
    public void givenExistentPath_printTheFile() throws IOException {
        Path p = Paths.get(FILE_PATH);
        Assert.assertEquals("sfsdf", FileHelper.printFile(p));
    }

}
