package p20220504;

import org.junit.Assert;
import org.junit.Test;

public class PalyndromeCheckSolution1 {


    //O(nˆ2) Time | O(n) Space

    public static boolean isPalindrome(String str) {
        // Write your code here.
        char [] reversedString = new char[str.length()];

        for(int idx = str.length()-1, rIdx = 0; idx>=0; idx--, rIdx++){
            reversedString[rIdx] = str.charAt(idx);
        }


        return String.valueOf(reversedString).equals(str);
    }


    @Test
    public void TestCase1() {
        Assert.assertTrue(isPalindrome("abcdcba"));
    }

}
