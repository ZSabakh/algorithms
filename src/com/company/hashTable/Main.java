package com.company.hashTable;

import com.company.circularArrayQueue.Queue;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        HashTable hashTable = new HashTable();
        hashTable.put(janeJones.getLastName(), janeJones);
        hashTable.put(johnDoe.getLastName(), johnDoe);
        hashTable.put(marySmith.getLastName(), marySmith);
        hashTable.put(mikeWilson.getLastName(), mikeWilson);
        hashTable.put(billEnd.getLastName(), billEnd);

        hashTable.printTable();
        hashTable.remove(billEnd.getLastName());
        hashTable.remove(marySmith.getLastName());
        hashTable.printTable();
    }
}
