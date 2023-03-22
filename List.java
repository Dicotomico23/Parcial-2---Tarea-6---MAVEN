package org.example;

public interface List <T>{
    void addAtTail(T data);
    void AddToFront(T data);
    void Remove(int index);
    void RemoveAll();
    void SetAt(int index, T data);
    T getAt(int index);
    void RemoveAllWithValue(T data);
    int getSize();
    LinkedListIterator getIterator();
    void PrintList();
}
