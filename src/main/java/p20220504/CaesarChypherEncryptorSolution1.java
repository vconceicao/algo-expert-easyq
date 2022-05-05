package p20220504;

import org.junit.Assert;
import org.junit.Test;

public class CaesarChypherEncryptorSolution1 {

    //O(n) time | O(n) space
    public static String caesarCypherEncryptor(String str, int key) {
        char cipherArray[] = new char[str.length()];
        key = key % 26;
        for(int idx = 0; idx<str.length(); idx++){

            cipherArray[idx] = shiftCharacter(str.charAt(idx), key);


        }
        return String.valueOf(cipherArray);
    }

    public static char shiftCharacter(char letter, int key){


        int newUnicodeLetter = letter + key;

        if(newUnicodeLetter <=122){
            return (char) newUnicodeLetter;
        }else{
            return (char) (96 + newUnicodeLetter % 122);
        }

    }

    @Test
    public void TestCase1() {
        Assert.assertTrue(caesarCypherEncryptor("xyz", 2).equals("zab"));
    }
}
