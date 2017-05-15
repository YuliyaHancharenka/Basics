package thinkingInJava;

//Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each number (from the third on) is the sum of the previous two.
// Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from the beginning,
// e.g., If you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n;
        int sum_fib;

        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.print(a + " " + b + " ");
        do {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");
        }
        while (sum_fib != 5);
    }
}
