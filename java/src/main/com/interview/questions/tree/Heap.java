package com.interview.questions.tree;

import com.interview.questions.InvalidInputException;

public interface Heap {
    void insert(Double value);

    Double pop() throws InvalidInputException;

    Double first();

    Double last();

    int size();

    boolean isEmpty();
}
