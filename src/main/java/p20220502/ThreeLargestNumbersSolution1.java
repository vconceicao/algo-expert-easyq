package p20220502;

import org.junit.Assert;
import org.junit.Test;

public class ThreeLargestNumbersSolution1 {

    //TimeComplixy - O(n) - because we have to traverse the array as we are shifting elements in the other array.
    //SpaceComplexity - O(1) - because we have created a new array with constant space to store the largest numbers
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.


        int[] threeLargestNumbers = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < array.length; i++) {

            //O(1)
            shiftNumbers(array, threeLargestNumbers, i);
        }
        return threeLargestNumbers;
    }

    private static void shiftNumbers(int[] array, int[] threeLargestNumbers, int indexAtInputArray) {
        int threeLargestNumbersIndex = threeLargestNumbers.length - 1;

        int thirdPosition = threeLargestNumbers[threeLargestNumbersIndex];
        int secondPosition = threeLargestNumbers[threeLargestNumbersIndex -1];


        if (array[indexAtInputArray]> threeLargestNumbers[threeLargestNumbersIndex]) {

            threeLargestNumbers[threeLargestNumbersIndex] = array[indexAtInputArray];
            threeLargestNumbers[threeLargestNumbersIndex -1] = thirdPosition;
            threeLargestNumbers[threeLargestNumbersIndex -2] = secondPosition;

        }else if(array[indexAtInputArray]> threeLargestNumbers[threeLargestNumbersIndex -1]){

            threeLargestNumbers[threeLargestNumbersIndex -1] = array[indexAtInputArray];
            threeLargestNumbers[threeLargestNumbersIndex -2] = secondPosition;

        }else if(array[indexAtInputArray]> threeLargestNumbers[threeLargestNumbersIndex -2]){

            threeLargestNumbers[threeLargestNumbersIndex -2] = array[indexAtInputArray];

        }
    }


    @Test
    public void TestCase1() {
        int[] expected = {18, 141, 541};
        Assert.assertTrue(
                compare(
                        findThreeLargestNumbers(new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}),
                        expected));
    }

    public boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
