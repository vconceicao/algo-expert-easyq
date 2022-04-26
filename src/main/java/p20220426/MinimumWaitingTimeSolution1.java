package p20220426;

import java.util.ArrayList;
import java.util.Arrays;

/*
* Time Complexity - O(m log m + w) where we have to sort the array to calculate the minimum amount of waiting time and w means that we have  traverse
*  and sum all the elements of the list
*
* Space Complexiy - O(n) as we have to create a list to store the sum of minimum waiting time of queries
* */
public class MinimumWaitingTimeSolution1 {

    public static void main(String[] args) {

        int[] queries = new int[] {3, 2, 1, 2, 6};
        int expected = 17;
        var actual = minimumWaitingTime(queries);
        System.out.println(actual);
    }


    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);
        ArrayList<Integer> list = new ArrayList<>();
        int minimumWaitingTime =0;
        list.add(minimumWaitingTime);

        for (int i = 0; i < queries.length -1; i++) {
            minimumWaitingTime = minimumWaitingTime + queries[i];
            list.add(minimumWaitingTime);
        }


        return list.stream().mapToInt(n -> n).sum();
    }
}
