package hakerrank;

//Given an array of n integers, find and print the minimum absolute difference between any two elements in the array.

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int minDiff = a[1]-a[0];
        for (int i = 2 ; i < a.length ; i++) {
            minDiff = Math.min(minDiff, a[i]-a[i-1]);
        }
        System.out.println(minDiff);
    }
}
