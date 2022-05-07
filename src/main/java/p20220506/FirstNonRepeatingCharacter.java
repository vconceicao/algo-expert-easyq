package p20220506;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    //O(n) Time | O(1) Space - because the string will be limited to English Alphabet letters or 26, this will be constant
    public int firstNonRepeatingCharacter(String string) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int idx =0; idx<string.length(); idx++ ){

            if(!map.containsKey(string.charAt(idx))){
                map.put(string.charAt(idx), 1);
            }else{
                map.put(string.charAt(idx), map.get(string.charAt(idx)) + 1);
            }

        }

        for(int idx=0; idx < string.length(); idx++){

            if(map.get(string.charAt(idx))==1){
                return idx;
            }

        }

        return -1;
    }


    @Test
    public void TestCase1() {
        String input = "abcdcaf";
        int expected = 1;
        var actual = firstNonRepeatingCharacter(input);
        Assert.assertTrue(expected == actual);
    }
}
