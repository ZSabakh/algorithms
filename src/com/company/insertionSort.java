package com.company;

public class insertionSort {
    public static void main(String[] args){
        int[] intArray = {51, 23, 61, 22, 6, 81};
        /*
        * unsortedIndex = 1;
        * toSort = 23;
        * i = 1
        * intArray[i-1] = 51;
        * 51 > 23
        * 23 replaced by 51;
        * i = 0;
        * break;
        * 51 replaced by 23;
        * */
        
        for(int unsortedIndex = 1; unsortedIndex < intArray.length; unsortedIndex++){
            int toSort = intArray[unsortedIndex];
            int i;
            for(i = unsortedIndex; i > 0 && intArray[i-1] > toSort; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = toSort;
        }


        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

}
