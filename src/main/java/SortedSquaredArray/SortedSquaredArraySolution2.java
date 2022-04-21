package SortedSquaredArray;

import java.util.Arrays;

public class SortedSquaredArraySolution2 {

    public static void main(String[] args) {

        //Time complexity - O(n) - where n is the number elements of the array that we have to iterate
        //Space complexity - O(n) - where n is the size of the input array
        int[] array = new int[]{1,2,3,5,6,8,9};
        System.out.println(Arrays.toString(sortedSquaredArray(array)));


    }

    private static int[] sortedSquaredArray(int[] array) {

        int[] squaredArray = new int[array.length];

        int leftIndex = 0;
        int rightIndex = array.length -1;
        int squaredArrayIndex = array.length -1;
        while(leftIndex <= rightIndex) {

            if (Math.abs(array[leftIndex]) < Math.abs(array[rightIndex])) {
                squaredArray[squaredArrayIndex] = array[rightIndex] * array[rightIndex];
                rightIndex--;
            } else {
                squaredArray[squaredArrayIndex] = array[leftIndex] * array[leftIndex];
                leftIndex++;
            }
            squaredArrayIndex--;
        }

        return squaredArray;
    }


}
