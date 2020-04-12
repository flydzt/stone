package com.flydzt.stone.ast;

import com.flydzt.stone.Token;

import java.util.ArrayList;
import java.util.Iterator;

public class ASTLeaf extends ASTree {
    private static final ArrayList<ASTree> empty = new ArrayList<>();
    protected Token token;

    public ASTLeaf(Token t) {
        this.token = t;
    }

    public Token token() {
        return token;
    }

    @Override
    public ASTree child(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int numChildren() {
        return 0;
    }

    @Override
    public Iterator<ASTree> children() {
        return empty.iterator();
    }

    @Override
    public String location() {
        return "at line " + token.getLineNumber();
    }

    @Override
    public String toString() {
        return token.getText();
    }
}
