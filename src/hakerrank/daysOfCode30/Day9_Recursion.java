package hakerrank.daysOfCode30;

import java.util.Scanner;

/*
Write a factorial function that takes a positive integer, N as a parameter and prints the result of N!(N factorial).
Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of 0.
Input Format
A single integer, N (the argument to pass to factorial).
 */
public class Day9_Recursion {

    int n;
    static int result = 1;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //System.out.println(factorial(n));
        for (int i = n; i > 1; i--) {                                // W/O RECURSION
            result *= i;
        }
        if (n == 1) {
            result = 1;
        }
        System.out.println(result);
    }

    /*public static int factorial(int n) {//5                        // WITH RECURSION
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;//5*4*3*2*1
        }

    }*/
}
