package p20220504;

import org.junit.Assert;
import org.junit.Test;

public class PalyndromeCheckSolution3 {


    //O(nˆ2) Time | O(n) Space

    public static boolean isPalindrome(String str) {


      return isPalindromeRecursive( str, 0);
    }


    public static boolean isPalindromeRecursive(String str, int i){

        int j = str.length() -1 -i;

        if (i>=j) {
            return true;
        } else if (str.charAt(i) != str.charAt(j)) {
            return false;
        }else{
            return isPalindromeRecursive(str, i + 1);
        }
    }


    @Test
    public void TestCase1() {
        Assert.assertTrue(isPalindrome("abcdcba"));
    }

}
