package com.epitome.ec.core;

import java.util.List;

/**
 * Created by maheshvibhute on 10/6/17.
 * Copyright: Resilient Software
 */
public interface Node<T> {
    Node<T> getParent();

    boolean hasChildren();

    List<Node<T>> getChildren();

    void accept(NodeVisitor visitor);
}
