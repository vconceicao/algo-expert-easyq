package p20220427;

import java.util.Arrays;

//Time complexity - O(n log n) - due to sort of the array
//Space complexity - O(1) - because we're only doing constant space operations

public class MinimumWaitingTimeMD {


    public static void main(String[] args) {
        int[] queries = new int[]{5,1,4};
        System.out.println(minimumWaitingTime(queries));
    }

    public static int minimumWaitingTime(int[] queries) {

        Arrays.sort(queries);

        int minimumWaitingTimeSum = 0;
        for (int i = 0; i < queries.length -1; i++) {

            int queriesLeft  = queries.length - (i+1);

            minimumWaitingTimeSum += queries[i] * queriesLeft;


        }

        return minimumWaitingTimeSum;
    }

}
