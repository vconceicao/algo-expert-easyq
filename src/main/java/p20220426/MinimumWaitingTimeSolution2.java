package p20220426;

import java.util.ArrayList;
import java.util.Arrays;

/*
* Time Complexity - O(n log n ) where we have to sort the array to calculate the minimum amount of waiting time
*
* Space Complexiy - O(1) as we have to create a list to store the sum of minimum waiting time of queries
* */
public class MinimumWaitingTimeSolution2 {

    public static void main(String[] args) {

        int[] queries = new int[] {3, 2, 1, 2, 6};
        int expected = 17;
        var actual = minimumWaitingTime(queries);
        System.out.println(actual);
    }


    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);
        int totalWaitingTime = 0;

        for(int i = 0; i < queries.length; i++){

            int queriesLeft = queries.length - (i + 1);
            totalWaitingTime +=queries[i] * queriesLeft;
        }
        return totalWaitingTime;
    }
}
