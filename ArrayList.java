package org.example;

public class ArrayList<T> implements List<T>{
    private static final int INITIAL_SIZE = 2;
    private T []array;
    private int size;
    public ArrayList(){array = (T[]) new Object[INITIAL_SIZE];    }
    public void addAtTail(T data){
        if(size == array.length) IncreaseArray();
        array[size] = data;
        size++;
    }
    public void AddToFront(T data) {
    }
    public void Remove(int index) {
    }
    public void RemoveAll() {
    }
    public void SetAt(int index, T data) {
    }
    public T getAt(int index) {
        return null;
    }
    public void RemoveAllWithValue(T data) {
    }
    public void deleteElement(T data){
        for(int cont=0;cont<size;cont++){
            if(array[cont].equals(data)){
                array[cont] = null;
                System.out.println("Element Removed!");
            }
        }
    }
    public void deleteByIndex(int index){
        int cont = 0;
        for(;cont<index;cont++);
            array[cont] = null;
            System.out.println("Element Removed at index: "+cont);
    }
    public int getSize(){
        return size;
    }
    public LinkedListIterator getIterator() {
        return null;
    }
    public void PrintList() {}
    public void IncreaseArray(){
        System.out.println("Array increased, new size: "+getSize()*2);
        T[] newArray = (T[]) new Object[array.length * 2];
        for(int cont=0;cont<size;cont++){
            newArray[cont] = array[cont];
        }
        array = newArray;
    }
    public void PrintArray(){
        for(int cont=0;cont<size;cont++){
            System.out.println("["+array[cont]+"]");
        }
    }
}
