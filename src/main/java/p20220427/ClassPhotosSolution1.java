package p20220427;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassPhotosSolution1 {

    public static void main(String[] args) {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));

        System.out.println(classPhotos(redShirtHeights, blueShirtHeights));


    }

    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        // Time Complexity - O(n log n) due to sorting the array
        //Spapce Complexity - O(1)
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        List<Integer> backRow = null;
        List<Integer> frontRow = null;


        int result = Integer.max(redShirtHeights.get(redShirtHeights.size()-1),blueShirtHeights.get(blueShirtHeights.size()-1) );

        if(redShirtHeights.get(redShirtHeights.size()-1) == result){

            backRow = redShirtHeights;
            frontRow = blueShirtHeights;
        }else{

            backRow = blueShirtHeights;
            frontRow = redShirtHeights;


        }


        int index = 0;

        while(index < backRow.size()){

            if(backRow.get(index)<=frontRow.get(index)){
                return false;
            }

            index++;

        }

        return true;


    }
}
