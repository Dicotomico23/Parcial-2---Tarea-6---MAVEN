package org.example;
public class Main {
    public static void main(String[] args) {
        List list1 = new LinkedList();
        List list2 = new ArrayList();
        list1.addAtTail(1.15);
        list1.addAtTail(2);
        list1.addAtTail(3.14);
        list1.addAtTail(4);
        list1.RemoveAllWithValue("4");
        list1.Remove(2);
        list1.PrintList();
        System.out.println("size: "+list1.getSize());
        list2.addAtTail("ArrayList");
        list2.addAtTail("Diego");
        list2.addAtTail("Lopez");
        list2.addAtTail("Facundo");
        ((ArrayList) list2).deleteElement("ArrayList");
        ((ArrayList)list2).deleteByIndex(2);
        ((ArrayList)list2).PrintArray();
        System.out.println("size: "+list2.getSize());
    }
}