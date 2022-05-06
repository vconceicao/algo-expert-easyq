package p20220505;

import org.junit.Assert;
import org.junit.Test;

public class GenerateDocumentSolution1 {

    //O(m * (n + m)) time - n number of chars and m is length of the doc| O(1) space
    public boolean generateDocument(String characters, String document) {
        // Write your code here.
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            int docFrequency = countCharFrequency(character, document);
            int charsFrequency = countCharFrequency(character, characters);
            if (docFrequency> charsFrequency) {
                return false;
            }

        }
        return true;
    }

    private int countCharFrequency(char character, String target) {
        int frequency = 0;
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (c == character) {
                frequency+=1;
            }
        }
        return frequency;
    }


    @Test
    public void TestCase1() {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        boolean expected = true;
        var actual = generateDocument(characters, document);
        Assert.assertTrue(expected == actual);
    }

}
