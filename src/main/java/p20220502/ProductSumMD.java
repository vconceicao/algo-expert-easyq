package p20220502;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSumMD {


    //Time COmplexity -  O(n) where n is number of elements in the array, including special arrays and its sub elements
    //Space Complexity - O(d) as we are doing a recursive approach, d means the greatest depth of the special array.
    public static int productSum(List<Object> array) {

        return productSumHelper(array, 1);
    }



    public static int productSumHelper(List<Object> array, int multiplier){

        int productSum = 0;
        for(int i = 0; i< array.size(); i++){

            if(array.get(i) instanceof ArrayList){
                productSum+= productSumHelper((ArrayList<Object>)array.get(i), multiplier+ 1);
            }else{
                productSum+=(int) array.get(i);
            }



        }

        return productSum * multiplier;

    }


    @Test
    public void TestCase1() {
        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        Assert.assertTrue(
                productSum(test) == 12);
    }




}
