package p20220504;

import org.junit.Assert;
import org.junit.Test;

public class PalyndromeCheckSolution2 {

    //O(n) Time | O(1) Space

    public static boolean isPalindrome(String str) {
        // Write your code here.
        int rIdx = str.length() -1;
        int lIdx = 0;

        while(lIdx < rIdx){

            if(str.charAt(lIdx) != str.charAt(rIdx)){
                return false;
            }

            lIdx++;
            rIdx--;

        }

        return true;
    }


    @Test
    public void TestCase1() {
        Assert.assertTrue(isPalindrome("abcdcba"));
    }

}
