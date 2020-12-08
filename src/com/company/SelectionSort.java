package com.company;

public class SelectionSort {
    public static void main (String[] args){
        int[] intArray = {51, 23, 61, 22, 6, 81};

        for(int indexSorting = intArray.length - 1; indexSorting > 0; indexSorting--){
            int largest = 0;

            for(int i = 0; i <= indexSorting; i++){
                if(intArray[largest] < intArray[i]){
                    largest = i;
                }
            }
            swap(intArray, indexSorting, largest);

        }


        for(int j = 0; j <  intArray.length; j++){
            System.out.println(intArray[j]);

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

