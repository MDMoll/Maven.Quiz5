package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author leon on 11/12/2018.
 */

public class MyStack<SomeType> implements Iterable<SomeType> {
    private Node first;
    private int n;
    
    private class Node<SomeType> {
        private SomeType someType;
        private Node<SomeType> next;
    }
    
    public MyStack() {
        first = null;
        n = 0;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public int size() {
        return n;
    }
    
    public void push(SomeType someType) {
        Node oldFirst = first;
        first = new Node();
        first.someType = someType;
        first.next = oldFirst;
        n++;
    }
    
    public SomeType pop() {
        if (isEmpty()) throw new EmptyStackException();
        SomeType someType = (SomeType) first.someType;
        first = first.next;
        n--;
        return someType;                // return the saved item
    }
    
    
    public MyStack peek() {
        if (isEmpty()) throw new EmptyStackException();
        return (MyStack) first.someType;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (SomeType someType : this) {
            s.append(someType).append(" ");
        }
        return s.toString();
    }
    
    public Iterator<SomeType> iterator() {
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<SomeType> {
        private Node<SomeType> current = first;
        
        public boolean hasNext() {
            return current != null;
        }
        
        public void remove() {
            throw new UnsupportedOperationException();
        }
        
        public SomeType next() {
            if (!hasNext()) throw new NoSuchElementException();
            SomeType someType = current.someType;
            current = current.next;
            return someType;
        }
    }
}
