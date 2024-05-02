package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Teht19<T> {
    public ArrayList<T> stack = new ArrayList<>();

    public void push(T x) {
        stack.add(x);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }


}
