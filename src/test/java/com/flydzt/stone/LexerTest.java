package com.flydzt.stone;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LexerTest {

    @Test
    public void lexerTest(String[] args) throws ParseException, IOException {
        File file = new File("test.txt");
        FileReader r = new FileReader(file);
        Lexer lexer = new Lexer(r);
        Token read;
        while ((read = lexer.read()) != Token.EOF) {
            System.out.println(read.getClass().getSimpleName() + ": " + read.getText());
        }
        r.close();
    }
}
