package p20220502;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortSolution1 {
    //TimeComplexity -  O(n) best cases/ O(n2) worst cases as we have to traverse the same array twice  with a inner loop to compare and swap elements until the entire array
    //gets sorted
    //Space COmplexity - O(1) because Bubble is an in place sort algorithm
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int aux = array[j];
                    array[j] =array[i];
                    array[i] = aux;
                }
            }
        }

            return array;
    }


    @Test
    public void TestCase1() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        Assert.assertTrue(compare(bubbleSort(input), expected));
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
