package com.flydzt.stone;

import com.flydzt.stone.Parser.Operators;
import com.flydzt.stone.ast.Name;
import com.flydzt.stone.ast.NumberLiteral;

import java.util.HashSet;
import java.util.Set;

import static com.flydzt.stone.Parser.rule;

public class BasicParser {
    Set<String> reserved = new HashSet<>();
    Operators operators = new Operators();
    Parser expr0 = rule();
    Parser primary = rule(PrimaryExpr.class)
            .or(rule().sep("(").ast(expr0).sep(")"),
                    rule().number(NumberLiteral.class),
                    rule().identifier(Name.class, reserved),
                    rule().string(StringLiteral.class));
}
