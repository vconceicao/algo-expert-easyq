package p20220428;

public class NthFibonacciSolution2 {

    public static void main(String[] args) {

        int fib = getNthFib(3);
        System.out.println(fib);

    }

    //Time Complexity - O(2ˆn) as we have to calculate  the some fibs twice as go through the recursive calls.
    //Space Complexiy - O(1) as we don't use any list or data structure to store anything
    public static int getNthFib(int n) {
        // Write your code here.
        if(n==2){
            return 1;
        }
        else if(n==1){
            return 0;
        }else{
            return getNthFib(n -1) + getNthFib(n-2);
        }

    }
}
