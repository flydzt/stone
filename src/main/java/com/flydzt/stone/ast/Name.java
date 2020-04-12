package com.flydzt.stone.ast;

import com.flydzt.stone.Token;

public class Name extends ASTLeaf {
    public Name(Token t) {
        super(t);
    }

    public String name() {
        return token().getText();
    }
}
