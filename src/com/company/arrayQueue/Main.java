package com.company.arrayQueue;

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

//        Peek will print out first element based on First in First out"
//        System.out.println(queue.peek());

//        Remove will remove first element based on same principle as peak.
//        queue.remove();
//        queue.printQueue();

//        Add will add the element to the back of the queue as opposed to peek and remove methods.
        queue.printQueue();
        System.out.println("---------");
        queue.add(mikeWilson);
        queue.printQueue();



    }
}
