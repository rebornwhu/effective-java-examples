package com.xiaolu.item26_generic_types;

import java.util.EmptyStackException;

@SuppressWarnings("unused")
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    public static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    private void ensureCapacity() {

    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();

        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public void pushAll(Iterable<E> src) {
        for (E e : src)
            push(e);
    }
}