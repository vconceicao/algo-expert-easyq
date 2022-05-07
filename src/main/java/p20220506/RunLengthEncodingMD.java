package p20220506;

import org.junit.Assert;
import org.junit.Test;

public class RunLengthEncodingMD {

    //O(n) time | O(n) space
    class Program {
        public String runLengthEncoding(String string) {
            // Write your code here.

            StringBuilder eSC = new StringBuilder();
            int currentRunLength =1;

            for (int i = 1; i < string.length(); i++) {
                char currentCharacter = string.charAt(i);
                char previousCharacter = string.charAt(i - 1);

                if ((currentCharacter!=previousCharacter) || (currentRunLength)==9){
                    eSC.append(Integer.toString(currentRunLength));
                    eSC.append(previousCharacter);
                    currentRunLength = 0;
                }
                currentRunLength +=1;
            }

            eSC.append(Integer.toString(currentRunLength));
            eSC.append(string.charAt(string.length() -1));


            return eSC.toString();
        }
    }
    @Test
    public void TestCase1() {
        var input = "AAAAAAAAAAAAABBCCCCDD";
        var expected = "9A4A2B4C2D";
        var actual = new Program().runLengthEncoding(input);
        Assert.assertTrue(expected.equals(actual));
    }
}
