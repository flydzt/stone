package com.flydzt.stone;

import com.flydzt.stone.ast.ASTree;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BasicParserTest {

    @Test
    public void lexerTest() throws ParseException, IOException {
        File file = new File("test.txt");
        FileReader r = new FileReader(file);
        Lexer lexer = new Lexer(r);
        BasicParser bp = new BasicParser();
        while (lexer.peek(0) != Token.EOF) {
            ASTree ast = bp.parse(lexer);
            System.out.println(ast.getClass().getSimpleName());
            System.out.println("=> " + ast.toString());
        }
        r.close();
    }
}
