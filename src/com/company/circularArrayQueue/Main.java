package com.company.circularArrayQueue;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        Queue queue = new Queue(10);
        queue.add(janeJones);
        queue.add(marySmith);


        queue.printQueue();
        System.out.println("---------");
        queue.add(mikeWilson);
        queue.printQueue();



    }
}
