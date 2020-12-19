package com.company;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = {5, 3, 2, 6, 8, 5, 10, 2, 9, 4};

        sort(intArray, 1, 10);

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void sort(int[] array, int minimal, int maximal) {
        int[] countArray = new int[(maximal - minimal) + 1];

        for(int i = 0; i < array.length; i++){
            countArray[array[i] - minimal] += 1;
            //For example 3 will be 3 - minimal (1 because it's from 1 to 10)
            //And array[2] corresponds to the right position cos of 0
        }

        int j = 0;
        for(int i = minimal; i <= maximal; i++){
            while(countArray[i - minimal] > 0){
                array[j++] = i;
                countArray[i - minimal]--;
            }
        }
    }
}
