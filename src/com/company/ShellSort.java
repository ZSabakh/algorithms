package com.company;

public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {51, 23, 61, 22, 6, 81};

        /*
        * Gapvalue initiated at 3;
        * i = 3;
        * toSort = array[3] which is 22;
        * j = 3;
        * j (3) is more or = to gapvalue (3) and array at 3-3 (51) is more than 22
        *       so -
        *             array[3] (22) will become array[j - gapvalue] (3-3) -- (51)
        *             j (3) -= 3 -- J will become 0 and we'll break out of the while loop
        * array[j] - array[0] - 51 will become tosort (22). and in while loop above 22 has become 51
        * */

        for(int gapValue = intArray.length / 2; gapValue > 0; gapValue /= 2){

            for(int i = gapValue; i < intArray.length; i++){
                int toSort = intArray[i];
                int j = i;
                while (j >= gapValue && intArray[j - gapValue] > toSort){
                    intArray[j] = intArray[j - gapValue];
                    j-= gapValue;
                }
                intArray[j] = toSort;
            }
        }


        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
