package p20220420;

import java.util.Arrays;

public class SortedSquaredArraySolution1 {

    public static void main(String[] args) {

        //Time complexity - O(n log n) - due to sorting array of squares at end of the method
        //Space complexity - O(n) - where n is the size of the input array
        int[] array = new int[]{1,2,3,5,6,8,9};
        System.out.println(Arrays.toString(sortedSquaredArray(array)));


    }

    private static int[] sortedSquaredArray(int[] array) {

        int[] squaredArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            int square = array[i] * array[i];

            squaredArray[i] = square;

        }

        Arrays.sort(squaredArray);

        return squaredArray;
    }


}
