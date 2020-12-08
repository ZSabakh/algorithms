package com.company;

public class Sorts2 {

    public static void main(String[] args) {
    int[] arrayInts = {15, 23, 17, 5, 14, 9, 21 };

for (int unsortedIndex = arrayInts.length - 1; unsortedIndex > 0; unsortedIndex--){
    for(int i = 0; i < unsortedIndex; i++){
        if(arrayInts[i] > arrayInts[i+1]){
            swap(arrayInts, i, i + 1);
        }
    }
}

//    for(int indexSorted = arrayInts.length - 1; indexSorted > 0; indexSorted--){
//        int biggest = 0;
//        for(int i = 0; i <= indexSorted; i++){
//            if(arrayInts[biggest] < arrayInts[i]){
//                biggest = i;
//            }
//            swap(arrayInts, indexSorted, biggest);
//        }
//
//    }
        for(int i = 0; i < arrayInts.length; i++){
            System.out.println(arrayInts[i]);
        }
}
    public static void swap(int[] intArray, int index1, int index2){
        if(intArray[index1] == intArray[index2]){
            return;
        }
        int temp = intArray[index1];
        intArray[index1] = intArray[index2];
        intArray[index2] = temp;
    }

}

