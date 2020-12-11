package com.company;
//Gets factorial of number (n!) compares recursive and iterative method for calculation.

public class FactorialTest {
    public static void main(String[] args) {

    long startIterative = System.nanoTime();
    System.out.println(iterationFactorial(3));
    long stopIterative = System.nanoTime();

    System.out.println("Iterative method: " + (stopIterative - startIterative));
    //Will run faster uses less memory.

    long startRecursive = System.nanoTime();
    System.out.println(recursionFactorial(3));
    long stopRecursive = System.nanoTime();

    System.out.println("Recursive method: " + (stopRecursive - startRecursive));
    //Stackframes use memory in recursion.
    }


    public static int recursionFactorial(int number){
        if(number == 0){
            return 1;
        }

        return number * recursionFactorial(number - 1);
        //Pushin to the callstack until number - 1 = 0 so 1 is returned
    }

    public static int iterationFactorial(int number){

        if(number == 0) {
            return 1;
        }
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }

        return factorial;
    }
}
