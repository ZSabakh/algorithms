package com.company.stacks;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);//Will be o(n) if I have to resize.
        stack.push(new Employee("Mikheil", "Saakashvili", 555));
        stack.push(new Employee("Bidzina", "Ivanishvili", 15));
        stack.push(new Employee("Bera", "Ivanishvili", 15));
        stack.push(new Employee("Uta", "Ivanishvili", 15));

        System.out.println(stack.peak());
//        stack.printStack();
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peak());

    }

}