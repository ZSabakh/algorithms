package com.company.circularArrayQueue;

import java.util.NoSuchElementException;

public class Queue {
    private Employee[] queue;
    private int front;
    private int back;

    public Queue(int maxCapacity){
        queue = new Employee[maxCapacity];
    }

    public void add(Employee employee){
        if(employeeAmount() == queue.length - 1){
            int currentSize = employeeAmount();
            Employee[] newArray = new Employee[queue.length * 2];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back );

            queue = newArray;

            front = 0;
            back = currentSize;
        }
        queue[back] = employee;
        back++;
    }

    public Employee remove(){
        if(employeeAmount() == 0){
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(employeeAmount() == 0){
            front = 0;
            back = 0;
        }
        else if (front == queue.length){
            front = 0;
        }

        return employee;
    }

    public Employee peek(){
        if(employeeAmount() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int employeeAmount(){
        if(front <= back){
            return back-front;
        }else{
            return back - front + queue.length;
        }
    }

    public void printQueue() {
        if(front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }else{
            for (int i = front; i < queue.length; i++){
                System.out.println(queue[i]);
            }
            for(int i = 0; i < back; i++){
                System.out.println(queue[i]);
            }
        }
    }


}
