package p20220419;

import java.util.Arrays;

public class ValidateSubSequenceSolution1 {

    public static void main(String[] args) {

        //Time Complexity O(n2) - double for
        //Space Complexity O(1) -  no array or data structure was created
        int array[] = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        int subSequence[] = new int[]{1, 6, -1, 10};
        System.out.println(isValidSubsequence(array, subSequence));
        //
    }

    private static boolean isValidSubsequence(int[] array, int[] subSequence) {

        int subSequenceCount = 0;
        for (int i = 0; i < array.length; i++) {  //O(n2) time
            for (int j = 0; j < subSequence.length; j++) {
                if (array[i] == subSequence[j]) {
                    subSequenceCount++;
                    break;
                }
            }
        }

        return subSequenceCount == subSequence.length;
    }
}
