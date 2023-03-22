package org.example;

public class LinkedListIterator<T> implements ListIterator <T>{
    private Node currentNode;

    LinkedListIterator(Node head){
        currentNode = head;
    }
    public boolean hasNext(){
        return currentNode != null;
    }

    public T next(){
        T data = (T) currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}