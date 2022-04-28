package p20220427;

import java.util.Arrays;
import java.util.Collections;

public class TandemBycicleSolution1 {

    public static void main(String[] args) {

        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = false;

        int tandemBicycle = tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);

        System.out.println(tandemBicycle);

    }

    //Time Complexity - O(n log n) - due to sorting the arrays
    //Space Complexity - O(n) - because we're not reversing the second array with an in place type of sorting
    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        Arrays.sort(redShirtSpeeds);
        if(!fastest){
            Arrays.sort(blueShirtSpeeds);
        }else{
            blueShirtSpeeds = Arrays.stream(blueShirtSpeeds).boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
        int tandemCyclistIndex = 0;
        int totalSpeed = 0;
        while(tandemCyclistIndex< redShirtSpeeds.length){



            totalSpeed += Integer.max(redShirtSpeeds[tandemCyclistIndex], blueShirtSpeeds[tandemCyclistIndex]);


            tandemCyclistIndex++;


        }


        return totalSpeed;
    }
}
