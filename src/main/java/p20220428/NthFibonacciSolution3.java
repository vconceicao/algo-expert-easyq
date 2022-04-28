package p20220428;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacciSolution3 {

    public static void main(String[] args) {

        int fib = getNthFib(3);
        System.out.println(fib);

    }

    //Time Complexity - O(n) as we have to calculate  the fibs as go through the recursive calls.
    //Space Complexiy - O(n) as we use data structure to store calculations

    public static int getNthFib(int n) {
        // Write your code here.

        Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
        cache.put(1, 0);
        cache.put(2,1);
        return getNthFib(n, cache);

    }

    public static int getNthFib(int n, Map<Integer, Integer> cache){
        if(cache.containsKey(n)){

            return cache.get(n);
        }else{
            cache.put(n, getNthFib(n -1, cache) + getNthFib(n -2, cache));
            return cache.get(n);
        }
    }
}
