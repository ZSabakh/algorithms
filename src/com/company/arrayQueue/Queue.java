package com.company.arrayQueue;

import java.util.NoSuchElementException;

public class Queue {
    private Employee[] queue;
    private int front;
    private int back;

    public Queue(int maxCapacity){
        queue = new Employee[maxCapacity];
    }

    public void add(Employee employee){
        if(back == queue.length){
            //If upon adding element array becomes bigger than the max capacity,
            //double the capacity of array by creating new array, copying to it and
            //pointing to it.
            Employee[] newArray = new Employee[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        //Add employee to the back index of array and increment back index.
        queue[back] = employee;
        back++;
    }

    public Employee remove(){
        if(employeeAmount() == 0){
            throw new NoSuchElementException();
        }
        //Copy the first element of queue into temp variable and then make front of queue null.
        Employee employee = queue[front];
        queue[front] = null;
        //Incrementing front to "Remove" it from array."
        front++;
        //If we removed only item on queue, then reset front and back to 0
        if(employeeAmount() == 0){
            front = 0;
            back = 0;
        }

        return employee;
    }

    public Employee peek(){
        //There are no items in queue.
        if(employeeAmount() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int employeeAmount(){
        return back-front;
    }

    public void printQueue() {
        for(int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }


}
