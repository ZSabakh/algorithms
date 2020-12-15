package com.company;

import org.jetbrains.annotations.NotNull;

public class QuickSort {
    public static void main(String[] args){

    int[] intArray = {51, 23, 61, 22, 6, 81};

    sort(intArray, 0, intArray.length);

    for(int i = 0; i < intArray.length; i++){
        System.out.println(intArray[i]);
    }

    }

    public static void sort(int[] array, int start, int end){
        //If the below statement is true,
        //Array has only one element, thus process should return
        if(end - start < 2) {
            return;
        }
        //Return position of element in sorted array (correct sorted position)
        int pivotIndex = partrition(array, start, end);
        //partitioning for left and right sub-arrays (to pivot)
        sort(array, start, pivotIndex);
        sort(array, pivotIndex + 1, end);
    }

    public static int partrition(int @NotNull [] array, int start, int end){
        //Starting with first element
        int pivot = array[start];
        int i = start;
        int j = end;
        //Now traversal (i from left to right, j from right to left)
        //Stops when they cross each other

        while(i < j) {
            while (i < j && array[--j] >= pivot);
            if ( i < j) {
                array[i] = array[j];
            }
            while(i < j && array[++i] <= pivot);
            if( i < j) {
                array[j] = array[i];
            }

            array[j] = pivot;
            return j;
        }
        return 0;
    }
}
