package p20220428;

public class NthFibonacciSolution1 {

    public static void main(String[] args) {

        int fib = getNthFib(3);
        System.out.println(fib);

    }

    //Time Complexity - O(n) as we have to calculate the fib until we reach n
    //Space Complexiy - O(1) as we don't use any list or data structure to store anything
    public static int getNthFib(int n) {

        int f0 = 0;
        int f1 = 1;
        int sum = 0;

        if(n == 2){
            return 1;
        }
        if(n<=1){
            return 0;
        }
        int index = 3;

        while(index<= n){

            sum= f0 + f1;
            f0= f1;
            f1 =sum;
            index++;
        }


        return sum;
    }
}
