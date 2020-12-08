package com.company;

public class BubbleSort {

    public static void main(String[] args) {
    int[] arrayInts = {15, 23, 17, 5, 14, 9, 21 };

    for(int indexSorted = arrayInts.length - 1; indexSorted > 0; indexSorted--){
        for (int i=0;i < indexSorted;i++){
            if (arrayInts[i] > arrayInts[i+1]){
                swap(arrayInts, i, i +1);
            }
        }

    }

    for(int j = 0; j < arrayInts.length; j++){
            System.out.println(arrayInts[j]);
    }

}
    public static void swap(int[] funcArray, int i, int j){
        if(i == j) {
            return;
        }
        int temp = funcArray[i];
        funcArray[i] = funcArray[j];
        funcArray[j] = temp;
        return;

    }

}

