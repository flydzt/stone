package com.flydzt.stone.ast;

import java.util.List;

public class PrimaryExpr extends ASTList {
    public PrimaryExpr(List<ASTree> list) {
        super(list);
    }

    public static ASTree create(List<ASTree> list) {
        return list.size() == 1 ? list.get(0) : new PrimaryExpr(list);
    }
}
