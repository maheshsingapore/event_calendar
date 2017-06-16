package com.epitome.ec.core;

/**
 * Created by maheshvibhute on 10/6/17.
 * Copyright: Resilient Software
 */
public interface NodeVisitor<T> {
    void visit(Node<T> toVisit);
}
