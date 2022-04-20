package ValidateSubSequence;

public class ValidateSubSequenceSolution2 {

    public static void main(String[] args) {

        //Time Complexity - O(n) - one loop
        //Space Complexity - O(1) - no array or data structure created
        int array[] = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        int subSequence[] = new int[]{1, 6, -1, 10};
        System.out.println(isValidSubsequence(array, subSequence));
    }


    private static boolean isValidSubsequence(int[] array, int[] subSequence) {

        int subSequenceCount = 0;

        int arrayIndex = 0;
        int subSequenceIndex = 0;
        while (arrayIndex < array.length) { //O(n) time

            if (array[arrayIndex] == subSequence[subSequenceIndex]) {
                subSequenceCount++;
                subSequenceIndex++;
            }
            arrayIndex++;
        }

        return subSequenceCount == subSequence.length;
    }
}
