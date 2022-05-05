package p20220504;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortMD {
//Best: O(nˆ2) time | O(1) space

    public static int[] insertionSort(int[] array) {
        if (array.length ==0) {
            int[] newArray = new int[0];
            return newArray;

        }


        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(j, j -1, array);
                j-=1;
            }

        }
        return array;
    }

    private static void swap(int j, int i, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }


    @Test
    public void TestCase1() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        Assert.assertTrue(compare(insertionSort(input), expected));
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
