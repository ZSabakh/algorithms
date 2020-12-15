package com.company;

public class MergeSort {
    public static void main(String[] args){
        int[] intArray = {51, 23, 61, 5, 22, 6, 81};

        sort(intArray, 0, intArray.length);


        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void sort(int[] array, int start, int end){
        if(end - start < 2){
            return;
        }
        int middle = (start + end) / 2;
        sort(array, start, middle);
        sort(array, middle, end);
        merge(array, start, middle, end);

    }
    public static void merge(int[] array, int start, int middle, int end){
        if(array[middle - 1] <= array[middle]){
            return;
        }

        int i = start;
        int j = middle;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while(i < middle && j < end){
            //When hitting the end of left array (reach mid) break loop, when hitting end of right array (reach end) break loop;
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
            //If array[i] is less or= than array[j] then insert i into array and add 1 to it?
        }
        System.arraycopy(array, i, array, start + tempIndex, middle - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
