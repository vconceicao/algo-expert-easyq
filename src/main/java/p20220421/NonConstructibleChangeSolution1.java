package p20220421;

import java.util.Arrays;
import java.util.HashSet;


public class NonConstructibleChangeSolution1 {

    public static void main(String[] args) {

        //Time complexity - O(n log n) - due to sorting array of coins at the beginning of the method
        //Space complexity - O(1) - where 1 is because we're not creating any type data structure here.
        int[] coins = new int[]{5,7,1,1,2,3,22};
        System.out.println(nonConstructibleChange(coins));


    }

    private static int nonConstructibleChange(int[] coins) {

        Arrays.sort(coins);

        var change = 0;
        for (int i = 0; i < coins.length; i++) {

            if (coins[i] > change + 1) {
                return change + 1;
            }

            change += coins[i];
        }

        return change;

    }





}
