package TwoNumberSum;

import java.util.Arrays;

public class TwoNumberSumSolution1 {

    public static void main(String[] args) {
        //Time Complexity O(n2) - double for
        //Space Complexity O(n) -  new array
        int array[] = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int sum = 10;
        System.out.println(Arrays.toString(twoNumberSum(array, sum )));
    }

    private static int[] twoNumberSum(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) { // time O(n)
            for (int j = i + 1; j < array.length; j++) { // time O(n)

                if (i+j==sum) { //O(1)
                    return new int[]{i , j}; //O(n) Space
                }
            }
        }
        
        return null;
    }


}
