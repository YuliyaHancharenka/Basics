package hakerrank.daysOfCode30;

import java.util.Scanner;

/*
Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed characters as 2 space-separated strings
on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.
 */
public class Day6_LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();// Scanner particularity  <-- has to be after int reading

        for (int j = 0; j < n; j++) {
            String s = scan.nextLine();
            char[] a = s.toCharArray();

            for (int i = 0; i < a.length; i++) {
                if (i == 0 || i % 2 == 0) {
                    System.out.print(a[i]);
                }
            }
            System.out.print(" ");
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(a[i]);
                }
            }
            System.out.println();
        }
    }
}

