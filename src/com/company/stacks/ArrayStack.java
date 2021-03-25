package com.company.stacks;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;//Track where the top of stack is

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top == stack.length){
            System.out.println("Stack is full");
           //Shall resize O(n)
           Employee[] newArray = new Employee[2*stack.length];
           System.arraycopy(stack, 0, newArray, 0, stack.length);
           stack = newArray;

        }

        stack[top++] = employee;//Push! o(1)
    }

    public Employee peak(){
        if(isEmpty()){
            throw new EmptyStackException();//Thanks Java util
        }
        return stack[top -1];
    }

    public Employee pop() {
        if(isEmpty()){
            throw new EmptyStackException();//Thanks Java util
        }
        Employee employee = stack[--top];
        stack[top] = null;//Popped
        return employee;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void printStack(){
        for(int i = top - 1; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}

