package p20220419;

import java.util.Arrays;
import java.util.HashSet;

public class TwoNumberSumSolution2 {

    public static void main(String[] args) {
        //Time Complexity O(n) - one iteration for
        //Space Complexity O(n) - one set and one array created
        int array[] = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int sum = 10;
        System.out.println(Arrays.toString(twoNumberSum(array, sum )));
    }

    private static int[] twoNumberSum(int[] array, int sum) {

        var set = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {

            if (!set.contains(sum - array[i])) {
                set.add(array[i]);
            } else {
                return new int[]{array[i], sum - array[i]};
            }

        }

        return null;

    }
}
