package com.interview.questions.linkedList;

import com.interview.questions.InvalidInputException;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public interface LinkedList<T> extends Collection<T> {
    void add(T value, int pos) throws InvalidInputException;

    void remove(int pos);

    void clear();

    T get(int pos);

    LinkedListNode getFirstNode();

    LinkedListNode getLastNode();

    String getLinkedListUi();
}
