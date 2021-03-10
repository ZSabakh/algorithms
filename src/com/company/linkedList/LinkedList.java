package com.company.linkedList;

public class LinkedList {
    public static void main(String[] args) {

        Employee mishaSaakasvili = new Employee("Misha", "Saakashvili", 5);
        Employee bidzinaIvanishvili = new Employee("Bidzina", "Ivanishvili", 41);
        Employee shalvaNatelashvili = new Employee("Shalva", "Natelashvili", 25);
        Employee gigaBokeria = new Employee("Giga", "Bokeria", 7);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(mishaSaakasvili);
        list.addToFront(bidzinaIvanishvili);
        list.addToFront(shalvaNatelashvili);
        list.addToFront(gigaBokeria);
        list.printList();
        System.out.println(list.getSize());
        list.removeFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
