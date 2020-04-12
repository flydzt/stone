package com.flydzt.stone.ast;

import java.util.Iterator;

public abstract class ASTree implements Iterable<ASTree> {
    /**
     * 获取第i个节点
     */
    public abstract ASTree child(int i);
    /**
     * 节点个数
     */
    public abstract int numChildren();

    public abstract Iterator<ASTree> children();

    public abstract String location();

    @Override
    public Iterator<ASTree> iterator() {
        return children();
    }


}
