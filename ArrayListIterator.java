package org.example;

public class ArrayListIterator <T> implements ListIterator<T>{
    private Node currentNode;
    public boolean hasNext() {
        return currentNode != null;
    }
    public T next() {
        T data = (T) currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}
