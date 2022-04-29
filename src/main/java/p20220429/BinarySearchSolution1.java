package p20220429;

import org.junit.Assert;
import org.junit.Test;


public class BinarySearchSolution1 {

        //TimeComplexiy - O(log(n)) - where at iteration we are discarding half of the array
        //Space Compleixty - O(1) - as we don't use any data structure to story anything
        public static int binarySearch(int[] array, int target) {
            // Write your code here.

            int startIndex = 0;
            int endIndex = array.length-1;

            while(endIndex>=startIndex){

                int mid =  (endIndex + startIndex)/2;

                if(array[mid]==target){
                    return mid;
                }

                if(target > array[mid]){
                    startIndex = mid + 1;
                }else{
                    endIndex = mid -1;
                }


            }

            return -1;
        }

    @Test
    public void TestCase1() {
        Assert.assertTrue(
                binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33) == 3);
    }

}
