package com.company.hashTableJDK;


import com.company.hashTable.HashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put(janeJones.getLastName(),janeJones);
        hashMap.put(johnDoe.getLastName(), johnDoe);
        hashMap.put(marySmith.getLastName(), marySmith);
//        hashMap.put("Doe", mikeWilson);
        hashMap.putIfAbsent("Doe", mikeWilson);

//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        hashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
